package p358uc;

/* renamed from: uc.d */
/* loaded from: classes.dex */
public class C6375d implements com.eclipsesource.p043v8.JavaCallback {
    public C6375d(p358uc.C6376e r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.eclipsesource.p043v8.JavaCallback
    public java.lang.Object invoke(com.eclipsesource.p043v8.V8Object r2, com.eclipsesource.p043v8.V8Array r3) {
            r1 = this;
            r2 = 0
            com.eclipsesource.v8.V8Array r3 = r3.getArray(r2)
            int r0 = r3.length()
            byte[] r2 = r3.getBytes(r2, r0)
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r0 = p010a9.C0035c.f80a
            r3.<init>(r2, r0)
            return r3
    }
}
