package p053d7;

/* renamed from: d7.b */
/* loaded from: classes.dex */
public class C1340b implements android.os.IInterface {

    /* renamed from: a */
    public final /* synthetic */ int f6852a;

    /* renamed from: b */
    public final android.os.IBinder f6853b;

    /* renamed from: c */
    public final java.lang.String f6854c;

    public C1340b(android.os.IBinder r2, java.lang.String r3, int r4) {
            r1 = this;
            r1.f6852a = r4
            r0 = 1
            if (r4 == r0) goto L2e
            r0 = 2
            if (r4 == r0) goto L26
            r0 = 3
            if (r4 == r0) goto L1e
            r0 = 4
            if (r4 == r0) goto L16
            r1.<init>()
            r1.f6853b = r2
            r1.f6854c = r3
            return
        L16:
            r1.<init>()
            r1.f6853b = r2
            r1.f6854c = r3
            return
        L1e:
            r1.<init>()
            r1.f6853b = r2
            r1.f6854c = r3
            return
        L26:
            r1.<init>()
            r1.f6853b = r2
            r1.f6854c = r3
            return
        L2e:
            r1.<init>()
            r1.f6853b = r2
            r1.f6854c = r3
            return
    }

    /* renamed from: H */
    public void m3833H(int r4, android.os.Parcel r5) {
            r3 = this;
            android.os.IBinder r0 = r3.f6853b     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            r2 = 1
            r0.transact(r4, r5, r1, r2)     // Catch: java.lang.Throwable -> Lb
            r5.recycle()
            return
        Lb:
            r4 = move-exception
            r5.recycle()
            throw r4
    }

    @Override // android.os.IInterface
    public android.os.IBinder asBinder() {
            r1 = this;
            int r0 = r1.f6852a
            switch(r0) {
                case 0: goto Lf;
                case 1: goto Lc;
                case 2: goto L9;
                case 3: goto L6;
                default: goto L5;
            }
        L5:
            goto L12
        L6:
            android.os.IBinder r0 = r1.f6853b
            return r0
        L9:
            android.os.IBinder r0 = r1.f6853b
            return r0
        Lc:
            android.os.IBinder r0 = r1.f6853b
            return r0
        Lf:
            android.os.IBinder r0 = r1.f6853b
            return r0
        L12:
            android.os.IBinder r0 = r1.f6853b
            return r0
    }

    /* renamed from: k2 */
    public android.os.Parcel m3834k2() {
            r2 = this;
            int r0 = r2.f6852a
            switch(r0) {
                case 1: goto L10;
                case 2: goto L5;
                case 3: goto L6;
                default: goto L5;
            }
        L5:
            goto L1a
        L6:
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r2.f6854c
            r0.writeInterfaceToken(r1)
            return r0
        L10:
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r2.f6854c
            r0.writeInterfaceToken(r1)
            return r0
        L1a:
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r2.f6854c
            r0.writeInterfaceToken(r1)
            return r0
    }

    /* renamed from: l2 */
    public android.os.Parcel m3835l2(int r4, android.os.Parcel r5) {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r1 = r3.f6853b     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r2 = 0
            r1.transact(r4, r5, r0, r2)     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r0.readException()     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r5.recycle()
            return r0
        L11:
            r4 = move-exception
            goto L18
        L13:
            r4 = move-exception
            r0.recycle()     // Catch: java.lang.Throwable -> L11
            throw r4     // Catch: java.lang.Throwable -> L11
        L18:
            r5.recycle()
            throw r4
    }

    /* renamed from: m2 */
    public android.os.Parcel m3836m2(int r4, android.os.Parcel r5) {
            r3 = this;
            int r0 = r3.f6852a
            r1 = 0
            switch(r0) {
                case 1: goto L7;
                default: goto L6;
            }
        L6:
            goto L22
        L7:
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r2 = r3.f6853b     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L19
            r2.transact(r4, r5, r0, r1)     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L19
            r0.readException()     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L19
            r5.recycle()
            return r0
        L17:
            r4 = move-exception
            goto L1e
        L19:
            r4 = move-exception
            r0.recycle()     // Catch: java.lang.Throwable -> L17
            throw r4     // Catch: java.lang.Throwable -> L17
        L1e:
            r5.recycle()
            throw r4
        L22:
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r2 = r3.f6853b     // Catch: java.lang.Throwable -> L32 java.lang.RuntimeException -> L34
            r2.transact(r4, r5, r0, r1)     // Catch: java.lang.Throwable -> L32 java.lang.RuntimeException -> L34
            r0.readException()     // Catch: java.lang.Throwable -> L32 java.lang.RuntimeException -> L34
            r5.recycle()
            return r0
        L32:
            r4 = move-exception
            goto L39
        L34:
            r4 = move-exception
            r0.recycle()     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L39:
            r5.recycle()
            throw r4
    }

    /* renamed from: n2 */
    public void m3837n2(int r4, android.os.Parcel r5) {
            r3 = this;
            int r0 = r3.f6852a
            r1 = 0
            switch(r0) {
                case 1: goto L7;
                default: goto L6;
            }
        L6:
            goto L22
        L7:
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r2 = r3.f6853b     // Catch: java.lang.Throwable -> L1a
            r2.transact(r4, r5, r0, r1)     // Catch: java.lang.Throwable -> L1a
            r0.readException()     // Catch: java.lang.Throwable -> L1a
            r5.recycle()
            r0.recycle()
            return
        L1a:
            r4 = move-exception
            r5.recycle()
            r0.recycle()
            throw r4
        L22:
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r2 = r3.f6853b     // Catch: java.lang.Throwable -> L35
            r2.transact(r4, r5, r0, r1)     // Catch: java.lang.Throwable -> L35
            r0.readException()     // Catch: java.lang.Throwable -> L35
            r5.recycle()
            r0.recycle()
            return
        L35:
            r4 = move-exception
            r5.recycle()
            r0.recycle()
            throw r4
    }

    /* renamed from: o2 */
    public void m3838o2(int r4, android.os.Parcel r5) {
            r3 = this;
            android.os.IBinder r0 = r3.f6853b     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            r2 = 1
            r0.transact(r4, r5, r1, r2)     // Catch: java.lang.Throwable -> Lb
            r5.recycle()
            return
        Lb:
            r4 = move-exception
            r5.recycle()
            throw r4
    }

    /* renamed from: v */
    public android.os.Parcel m3839v() {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r2.f6854c
            r0.writeInterfaceToken(r1)
            return r0
    }

    /* renamed from: x */
    public void m3840x(int r4, android.os.Parcel r5) {
            r3 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.os.IBinder r1 = r3.f6853b     // Catch: java.lang.Throwable -> L14
            r2 = 0
            r1.transact(r4, r5, r0, r2)     // Catch: java.lang.Throwable -> L14
            r0.readException()     // Catch: java.lang.Throwable -> L14
            r5.recycle()
            r0.recycle()
            return
        L14:
            r4 = move-exception
            r5.recycle()
            r0.recycle()
            throw r4
    }
}
