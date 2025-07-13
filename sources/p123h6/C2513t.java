package p123h6;

/* renamed from: h6.t */
/* loaded from: classes.dex */
public final /* synthetic */ class C2513t implements p218m6.InterfaceC4396i {

    /* renamed from: Y */
    public final /* synthetic */ int f11336Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.String[] f11337Z;

    public /* synthetic */ C2513t(p123h6.C2516w r1, java.lang.String[] r2, int r3) {
            r0 = this;
            r0.f11336Y = r3
            r1 = 1
            if (r3 == r1) goto L14
            r1 = 2
            if (r3 == r1) goto Le
            r0.<init>()
            r0.f11337Z = r2
            return
        Le:
            r0.<init>()
            r0.f11337Z = r2
            return
        L14:
            r0.<init>()
            r0.f11337Z = r2
            return
    }

    @Override // p218m6.InterfaceC4396i
    /* renamed from: c */
    public final void mo813c(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.f11336Y
            switch(r0) {
                case 0: goto L27;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L48
        L6:
            java.lang.String[] r0 = r3.f11337Z
            h6.x r4 = (p123h6.C2517x) r4
            s7.j r5 = (p327s7.C5986j) r5
            h6.v r1 = new h6.v
            r2 = 2
            r1.<init>(r5, r2)
            android.os.IInterface r4 = r4.m11053y()
            h6.h r4 = (p123h6.C2501h) r4
            android.os.Parcel r5 = r4.m3834k2()
            p072e7.C1632i.m4227d(r5, r1)
            r5.writeStringArray(r0)
            r0 = 7
            r4.m3838o2(r0, r5)
            return
        L27:
            java.lang.String[] r0 = r3.f11337Z
            h6.x r4 = (p123h6.C2517x) r4
            s7.j r5 = (p327s7.C5986j) r5
            h6.v r1 = new h6.v
            r2 = 0
            r1.<init>(r5, r2)
            android.os.IInterface r4 = r4.m11053y()
            h6.h r4 = (p123h6.C2501h) r4
            android.os.Parcel r5 = r4.m3834k2()
            p072e7.C1632i.m4227d(r5, r1)
            r5.writeStringArray(r0)
            r0 = 5
            r4.m3838o2(r0, r5)
            return
        L48:
            java.lang.String[] r0 = r3.f11337Z
            h6.x r4 = (p123h6.C2517x) r4
            s7.j r5 = (p327s7.C5986j) r5
            h6.v r1 = new h6.v
            r2 = 1
            r1.<init>(r5, r2)
            android.os.IInterface r4 = r4.m11053y()
            h6.h r4 = (p123h6.C2501h) r4
            android.os.Parcel r5 = r4.m3834k2()
            p072e7.C1632i.m4227d(r5, r1)
            r5.writeStringArray(r0)
            r0 = 6
            r4.m3838o2(r0, r5)
            return
    }
}
