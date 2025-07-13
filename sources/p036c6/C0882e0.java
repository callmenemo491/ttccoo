package p036c6;

/* renamed from: c6.e0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0882e0 implements p218m6.InterfaceC4396i {

    /* renamed from: Y */
    public final /* synthetic */ int f4752Y;

    /* renamed from: Z */
    public final /* synthetic */ com.google.android.gms.cast.C1060d f4753Z;

    /* renamed from: a0 */
    public final /* synthetic */ com.google.android.gms.cast.C1057a.d f4754a0;

    /* renamed from: b0 */
    public final /* synthetic */ java.lang.String f4755b0;

    public /* synthetic */ C0882e0(com.google.android.gms.cast.C1060d r2, com.google.android.gms.cast.C1057a.d r3, java.lang.String r4) {
            r1 = this;
            r0 = 0
            r1.f4752Y = r0
            r1.<init>()
            r1.f4753Z = r2
            r1.f4754a0 = r3
            r1.f4755b0 = r4
            return
    }

    public /* synthetic */ C0882e0(com.google.android.gms.cast.C1060d r2, java.lang.String r3, com.google.android.gms.cast.C1057a.d r4) {
            r1 = this;
            r0 = 1
            r1.f4752Y = r0
            r1.<init>()
            r1.f4753Z = r2
            r1.f4755b0 = r3
            r1.f4754a0 = r4
            return
    }

    @Override // p218m6.InterfaceC4396i
    /* renamed from: c */
    public final void mo813c(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            int r0 = r8.f4752Y
            r1 = 1
            r2 = 12
            r3 = 0
            java.lang.String r4 = "Not active connection"
            r5 = 0
            switch(r0) {
                case 0: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L38
        Ld:
            com.google.android.gms.cast.d r0 = r8.f4753Z
            com.google.android.gms.cast.a$d r6 = r8.f4754a0
            java.lang.String r7 = r8.f4755b0
            h6.e0 r9 = (p123h6.C2496e0) r9
            s7.j r10 = (p327s7.C5986j) r10
            int r0 = r0.f5418E
            if (r0 == r1) goto L1c
            goto L1d
        L1c:
            r1 = 0
        L1d:
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r4)
            if (r6 == 0) goto L32
            android.os.IInterface r9 = r9.m11053y()
            h6.e r9 = (p123h6.C2495e) r9
            android.os.Parcel r0 = r9.m3834k2()
            r0.writeString(r7)
            r9.m3838o2(r2, r0)
        L32:
            s7.q<TResult> r9 = r10.f23075a
            r9.m12473r(r3)
            return
        L38:
            com.google.android.gms.cast.d r0 = r8.f4753Z
            java.lang.String r6 = r8.f4755b0
            com.google.android.gms.cast.a$d r7 = r8.f4754a0
            h6.e0 r9 = (p123h6.C2496e0) r9
            s7.j r10 = (p327s7.C5986j) r10
            int r0 = r0.f5418E
            if (r0 == r1) goto L47
            goto L48
        L47:
            r1 = 0
        L48:
            com.google.android.gms.common.internal.C1101a.m3106k(r1, r4)
            android.os.IInterface r0 = r9.m11053y()
            h6.e r0 = (p123h6.C2495e) r0
            android.os.Parcel r1 = r0.m3834k2()
            r1.writeString(r6)
            r0.m3838o2(r2, r1)
            if (r7 == 0) goto L6f
            android.os.IInterface r9 = r9.m11053y()
            h6.e r9 = (p123h6.C2495e) r9
            android.os.Parcel r0 = r9.m3834k2()
            r0.writeString(r6)
            r1 = 11
            r9.m3838o2(r1, r0)
        L6f:
            s7.q<TResult> r9 = r10.f23075a
            r9.m12473r(r3)
            return
    }
}
