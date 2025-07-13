package p358uc;

/* renamed from: uc.c */
/* loaded from: classes.dex */
public class C6374c implements com.eclipsesource.p043v8.JavaCallback {

    /* renamed from: a */
    public final /* synthetic */ p358uc.C6376e f24846a;

    public C6374c(p358uc.C6376e r1) {
            r0 = this;
            r0.f24846a = r1
            r0.<init>()
            return
    }

    @Override // com.eclipsesource.p043v8.JavaCallback
    public java.lang.Object invoke(com.eclipsesource.p043v8.V8Object r7, com.eclipsesource.p043v8.V8Array r8) {
            r6 = this;
            r7 = 0
            java.lang.String r7 = r8.getString(r7)
            java.nio.charset.Charset r8 = p010a9.C0035c.f82c
            byte[] r7 = r7.getBytes(r8)
            int r8 = r7.length
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocateDirect(r8)
            r8.put(r7)
            com.eclipsesource.v8.V8ArrayBuffer r2 = new com.eclipsesource.v8.V8ArrayBuffer
            uc.e r0 = r6.f24846a
            com.eclipsesource.v8.V8 r0 = r0.f24847a
            r2.<init>(r0, r8)
            com.eclipsesource.v8.V8TypedArray r8 = new com.eclipsesource.v8.V8TypedArray
            uc.e r0 = r6.f24846a
            com.eclipsesource.v8.V8 r1 = r0.f24847a
            int r5 = r7.length
            r3 = 11
            r4 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r8
    }
}
