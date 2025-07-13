package p036c6;

/* renamed from: c6.f0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0884f0 implements p218m6.InterfaceC4396i {

    /* renamed from: Y */
    public final /* synthetic */ int f4756Y;

    /* renamed from: Z */
    public final /* synthetic */ com.google.android.gms.cast.C1060d f4757Z;

    /* renamed from: a0 */
    public final /* synthetic */ java.lang.String f4758a0;

    /* renamed from: b0 */
    public final /* synthetic */ java.lang.String f4759b0;

    public /* synthetic */ C0884f0(com.google.android.gms.cast.C1060d r2, java.lang.String r3, java.lang.String r4, int r5) {
            r1 = this;
            r1.f4756Y = r5
            r0 = 1
            if (r5 == r0) goto Lf
            r1.<init>()
            r1.f4757Z = r2
            r1.f4758a0 = r3
            r1.f4759b0 = r4
            return
        Lf:
            r1.<init>()
            r1.f4757Z = r2
            r1.f4758a0 = r3
            r1.f4759b0 = r4
            return
    }

    @Override // p218m6.InterfaceC4396i
    /* renamed from: c */
    public final void mo813c(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.f4756Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L30
        L6:
            com.google.android.gms.cast.d r0 = r7.f4757Z
            java.lang.String r1 = r7.f4758a0
            java.lang.String r2 = r7.f4759b0
            h6.e0 r8 = (p123h6.C2496e0) r8
            s7.j r9 = (p327s7.C5986j) r9
            r0.m2963i()
            android.os.IInterface r8 = r8.m11053y()
            h6.e r8 = (p123h6.C2495e) r8
            android.os.Parcel r3 = r8.m3834k2()
            r3.writeString(r1)
            r3.writeString(r2)
            r1 = 0
            p072e7.C1632i.m4225b(r3, r1)
            r1 = 14
            r8.m3838o2(r1, r3)
            r0.m2965k(r9)
            return
        L30:
            com.google.android.gms.cast.d r0 = r7.f4757Z
            java.lang.String r1 = r7.f4758a0
            java.lang.String r2 = r7.f4759b0
            h6.e0 r8 = (p123h6.C2496e0) r8
            s7.j r9 = (p327s7.C5986j) r9
            java.util.concurrent.atomic.AtomicLong r3 = r0.f5425p
            long r3 = r3.incrementAndGet()
            r0.m2963i()
            java.util.Map<java.lang.Long, s7.j<java.lang.Void>> r5 = r0.f5414A     // Catch: android.os.RemoteException -> L65
            java.lang.Long r6 = java.lang.Long.valueOf(r3)     // Catch: android.os.RemoteException -> L65
            r5.put(r6, r9)     // Catch: android.os.RemoteException -> L65
            android.os.IInterface r8 = r8.m11053y()     // Catch: android.os.RemoteException -> L65
            h6.e r8 = (p123h6.C2495e) r8     // Catch: android.os.RemoteException -> L65
            android.os.Parcel r5 = r8.m3834k2()     // Catch: android.os.RemoteException -> L65
            r5.writeString(r1)     // Catch: android.os.RemoteException -> L65
            r5.writeString(r2)     // Catch: android.os.RemoteException -> L65
            r5.writeLong(r3)     // Catch: android.os.RemoteException -> L65
            r1 = 9
            r8.m3838o2(r1, r5)     // Catch: android.os.RemoteException -> L65
            goto L74
        L65:
            r8 = move-exception
            java.util.Map<java.lang.Long, s7.j<java.lang.Void>> r0 = r0.f5414A
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r0.remove(r1)
            s7.q<TResult> r9 = r9.f23075a
            r9.m12472q(r8)
        L74:
            return
    }
}
