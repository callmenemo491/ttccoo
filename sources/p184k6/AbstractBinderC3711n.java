package p184k6;

/* renamed from: k6.n */
/* loaded from: classes.dex */
public abstract class AbstractBinderC3711n extends p248o6.AbstractBinderC4935t0 {

    /* renamed from: b */
    public int f16424b;

    public AbstractBinderC3711n(byte[] r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 25
            if (r0 != r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            com.google.android.gms.common.internal.C1101a.m3096a(r0)
            int r3 = java.util.Arrays.hashCode(r3)
            r2.f16424b = r3
            return
    }

    /* renamed from: H */
    public static byte[] m8175H(java.lang.String r1) {
            java.lang.String r0 = "ISO-8859-1"
            byte[] r1 = r1.getBytes(r0)     // Catch: java.io.UnsupportedEncodingException -> L7
            return r1
        L7:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
    }

    @Override // p248o6.InterfaceC4931r0
    /* renamed from: b */
    public final p408x6.InterfaceC6957a mo8176b() {
            r2 = this;
            byte[] r0 = r2.mo8178x()
            x6.b r1 = new x6.b
            r1.<init>(r0)
            return r1
    }

    @Override // p248o6.InterfaceC4931r0
    /* renamed from: c */
    public final int mo8177c() {
            r1 = this;
            int r0 = r1.f16424b
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L31
            boolean r1 = r4 instanceof p248o6.InterfaceC4931r0
            if (r1 != 0) goto L8
            goto L31
        L8:
            o6.r0 r4 = (p248o6.InterfaceC4931r0) r4     // Catch: android.os.RemoteException -> L29
            int r1 = r4.mo8177c()     // Catch: android.os.RemoteException -> L29
            int r2 = r3.f16424b     // Catch: android.os.RemoteException -> L29
            if (r1 == r2) goto L13
            return r0
        L13:
            x6.a r4 = r4.mo8176b()     // Catch: android.os.RemoteException -> L29
            if (r4 != 0) goto L1a
            return r0
        L1a:
            java.lang.Object r4 = p408x6.BinderC6958b.m14124H(r4)     // Catch: android.os.RemoteException -> L29
            byte[] r4 = (byte[]) r4     // Catch: android.os.RemoteException -> L29
            byte[] r1 = r3.mo8178x()     // Catch: android.os.RemoteException -> L29
            boolean r4 = java.util.Arrays.equals(r1, r4)     // Catch: android.os.RemoteException -> L29
            return r4
        L29:
            r4 = move-exception
            java.lang.String r1 = "GoogleCertificates"
            java.lang.String r2 = "Failed to get Google certificates from remote"
            android.util.Log.e(r1, r2, r4)
        L31:
            return r0
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.f16424b
            return r0
    }

    /* renamed from: x */
    public abstract byte[] mo8178x();
}
