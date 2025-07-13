package one.block.eosiojava.interfaces;

/* loaded from: classes.dex */
public interface ISignatureProvider {
    java.util.List<java.lang.String> getAvailableKeys();

    one.block.eosiojava.models.signatureProvider.C5328x49c37d4a signTransaction(one.block.eosiojava.models.signatureProvider.EosioTransactionSignatureRequest r1);
}
