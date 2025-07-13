package one.block.eosiojava.interfaces;

/* loaded from: classes.dex */
public interface IABIProvider {
    java.lang.String getAbi(java.lang.String r1, one.block.eosiojava.models.EOSIOName r2);

    java.util.Map<java.lang.String, java.lang.String> getAbis(java.lang.String r1, java.util.List<one.block.eosiojava.models.EOSIOName> r2);
}
