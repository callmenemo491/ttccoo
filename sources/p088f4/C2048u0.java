package p088f4;

/* renamed from: f4.u0 */
/* loaded from: classes.dex */
public class C2048u0 extends java.lang.Exception implements p088f4.InterfaceC2014i {

    /* renamed from: Y */
    public final int f9345Y;

    /* renamed from: Z */
    public final long f9346Z;

    static {
            k1.c r0 = p179k1.C3644c.f16084f0
            return
    }

    public C2048u0(android.os.Bundle r8) {
            r7 = this;
            r0 = 2
            java.lang.String r0 = m5409a(r0)
            java.lang.String r0 = r8.getString(r0)
            r1 = 3
            java.lang.String r1 = m5409a(r1)
            java.lang.String r1 = r8.getString(r1)
            r2 = 4
            java.lang.String r2 = m5409a(r2)
            java.lang.String r2 = r8.getString(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            r4 = 0
            r5 = 0
            r6 = 1
            if (r3 != 0) goto L58
            java.lang.Class<f4.u0> r3 = p088f4.C2048u0.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L53
            java.lang.Class r1 = java.lang.Class.forName(r1, r6, r3)     // Catch: java.lang.Throwable -> L53
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            boolean r3 = r3.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L4b
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L53
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r3[r5] = r4     // Catch: java.lang.Throwable -> L53
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch: java.lang.Throwable -> L53
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L53
            r3[r5] = r2     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r1.newInstance(r3)     // Catch: java.lang.Throwable -> L53
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch: java.lang.Throwable -> L53
            r4 = r1
        L4b:
            if (r4 != 0) goto L58
            android.os.RemoteException r4 = new android.os.RemoteException
            r4.<init>(r2)
            goto L58
        L53:
            android.os.RemoteException r4 = new android.os.RemoteException
            r4.<init>(r2)
        L58:
            java.lang.String r1 = m5409a(r5)
            r2 = 1000(0x3e8, float:1.401E-42)
            int r1 = r8.getInt(r1, r2)
            java.lang.String r2 = m5409a(r6)
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r2 = r8.getLong(r2, r5)
            r7.<init>(r0, r4)
            r7.f9345Y = r1
            r7.f9346Z = r2
            return
    }

    public C2048u0(java.lang.String r1, java.lang.Throwable r2, int r3, long r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.f9345Y = r3
            r0.f9346Z = r4
            return
    }

    /* renamed from: a */
    public static java.lang.String m5409a(int r1) {
            r0 = 36
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            return r1
    }
}
