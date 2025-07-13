package one.block.eosiojava.interfaces;

/* loaded from: classes.dex */
public interface ISerializationProvider {
    void deserialize(one.block.eosiojava.models.AbiEosSerializationObject r1);

    java.lang.String deserializeAbi(java.lang.String r1);

    java.lang.String deserializePackedTransaction(java.lang.String r1);

    java.lang.String deserializeTransaction(java.lang.String r1);

    void serialize(one.block.eosiojava.models.AbiEosSerializationObject r1);

    java.lang.String serializeAbi(java.lang.String r1);

    java.lang.String serializePackedTransaction(java.lang.String r1);

    java.lang.String serializeTransaction(java.lang.String r1);
}
