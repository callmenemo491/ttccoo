package p414xc;

/* renamed from: xc.i */
/* loaded from: classes.dex */
public class C7034i implements p394wc.InterfaceC6831b {
    public static final java.lang.String IDENTITY = "identity";
    public static final java.lang.String VARIANT_TYPE = "identity";
    private p414xc.C7036k gPermissionLevel;

    public C7034i() {
            r1 = this;
            r1.<init>()
            xc.k r0 = new xc.k
            r0.<init>()
            r1.gPermissionLevel = r0
            return
    }

    public C7034i(p414xc.C7036k r1) {
            r0 = this;
            r0.<init>()
            r0.gPermissionLevel = r1
            return
    }

    private java.util.Map<java.lang.String, java.lang.Object> toMap() {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            xc.k r1 = r3.gPermissionLevel
            java.util.Map r1 = r1.toMap()
            java.lang.String r2 = p414xc.C7036k.PERMISSION
            r0.put(r2, r1)
            return r0
    }

    public p414xc.C7036k getPermissionLevel() {
            r1 = this;
            xc.k r0 = r1.gPermissionLevel
            return r0
    }

    public java.util.List<p414xc.C7027b> getRawActions() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p394wc.InterfaceC6831b
    public java.util.List<java.lang.Object> toVariant() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "identity"
            r0.add(r1)
            java.util.Map r1 = r2.toMap()
            r0.add(r1)
            return r0
    }
}
