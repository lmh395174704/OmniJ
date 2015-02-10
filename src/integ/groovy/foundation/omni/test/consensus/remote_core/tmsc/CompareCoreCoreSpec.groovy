package foundation.omni.test.consensus.remote_core.tmsc

import com.msgilligan.bitcoin.rpc.RPCURL
import foundation.omni.consensus.MasterCoreConsensusTool
import foundation.omni.rpc.MastercoinClient
import foundation.omni.test.consensus.BaseConsensusSpec
import spock.lang.Ignore
import spock.lang.Title

import static foundation.omni.CurrencyID.TMSC

/**
 */
@Title("Compare Master Core vs. Remote Master Core (e.g. stable/last revision)")
class CompareCoreCoreSpec extends BaseConsensusSpec {

    void setupSpec() {

        MastercoinClient remoteClient = new MastercoinClient(RPCURL.stablePublicMainNetURL, 'xmc-msc-rpc', 'emdERDIDE82934$%$')
        setupComparisonForCurrency(new MasterCoreConsensusTool(remoteClient),
                TMSC)
    }
}
