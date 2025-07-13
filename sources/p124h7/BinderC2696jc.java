package p124h7;

/* renamed from: h7.jc */
/* loaded from: classes.dex */
public final class BinderC2696jc extends p124h7.AbstractBinderC2840rc {

    /* renamed from: c */
    public static final p306r6.C5797a f11681c = null;

    /* renamed from: a */
    public final p083f.C1933t f11682a;

    /* renamed from: b */
    public final p124h7.C2841rd f11683b;

    static {
            r6.a r0 = new r6.a
            java.lang.String r1 = "FirebaseAuthFallback:"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r2 = "FirebaseAuth"
            r0.<init>(r2, r1)
            p124h7.BinderC2696jc.f11681c = r0
            return
    }

    public BinderC2696jc(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r4, r0)
            h7.cd r0 = new h7.cd
            java.lang.String r1 = p124h7.C2571cd.m6532b()
            r0.<init>(r1)
            f.t r1 = new f.t
            h7.dd r2 = new h7.dd
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            r2.<init>(r4, r5, r0)
            r1.<init>(r2)
            r3.f11682a = r1
            h7.rd r5 = new h7.rd
            r5.<init>(r4)
            r3.f11683b = r5
            return
    }

    /* renamed from: x */
    public static boolean m6867x(long r3, boolean r5) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lb
            if (r5 != 0) goto L9
            goto Lb
        L9:
            r3 = 1
            return r3
        Lb:
            r6.a r3 = p124h7.BinderC2696jc.f11681c
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r0 = r3.f22479a
            java.lang.String r1 = "App hash will not be appended to the request."
            java.lang.String r3 = r3.m12162c(r1, r5)
            android.util.Log.w(r0, r3)
            return r4
    }

    @Override // p124h7.InterfaceC2876tc
    /* renamed from: E0 */
    public final void mo6868E0(p124h7.C2550ba r6, p124h7.InterfaceC2804pc r7) {
            r5 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r1 = r6.f11397Y
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            java.lang.String r1 = r6.f11398Z
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            java.util.Objects.requireNonNull(r7, r0)
            f.t r0 = r5.f11682a
            java.lang.String r1 = r6.f11397Y
            java.lang.String r2 = r6.f11398Z
            java.lang.String r6 = r6.f11399a0
            h7.fc r3 = new h7.fc
            r6.a r4 = p124h7.BinderC2696jc.f11681c
            r3.<init>(r7, r4)
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            h7.vd r7 = new h7.vd
            r4 = 3
            r7.<init>(r1, r2, r6, r4)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r6 = r0.f8425Z
            h7.kd r6 = (p124h7.AbstractC2715kd) r6
            h7.ab r1 = new h7.ab
            r2 = 1
            r1.<init>(r0, r3, r2)
            r0 = 0
            r6.mo6614r(r0, r7, r1)
            return
    }

    @Override // p124h7.InterfaceC2876tc
    /* renamed from: I1 */
    public final void mo6869I1(p124h7.C2945x9 r5, p124h7.InterfaceC2804pc r6) {
            r4 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r5, r0)
            h7.if r1 = r5.f12019Y
            java.util.Objects.requireNonNull(r1, r0)
            java.util.Objects.requireNonNull(r6, r0)
            f.t r1 = r4.f11682a
            h7.if r5 = r5.f12019Y
            h7.fc r2 = new h7.fc
            r6.a r3 = p124h7.BinderC2696jc.f11681c
            r2.<init>(r6, r3)
            java.util.Objects.requireNonNull(r1)
            java.util.Objects.requireNonNull(r5, r0)
            r6 = 1
            r5.f11656m0 = r6
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r6 = r1.f8425Z
            h7.kd r6 = (p124h7.AbstractC2715kd) r6
            h7.ab r0 = new h7.ab
            r3 = 9
            r0.<init>(r1, r2, r3)
            r1 = 0
            r6.mo6612p(r1, r5, r0)
            return
    }

    @Override // p124h7.InterfaceC2876tc
    /* renamed from: N1 */
    public final void mo6870N1(p124h7.C2530a9 r4, p124h7.InterfaceC2804pc r5) {
            r3 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r4, r0)
            java.util.Objects.requireNonNull(r5, r0)
            java.lang.String r0 = r4.f11369Y
            com.google.android.gms.common.internal.C1101a.m3100e(r0)
            f.t r0 = r3.f11682a
            java.lang.String r4 = r4.f11369Y
            h7.fc r1 = new h7.fc
            r6.a r2 = p124h7.BinderC2696jc.f11681c
            r1.<init>(r5, r2)
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r4)
            h7.de r5 = new h7.de
            r5.<init>(r4)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r4 = r0.f8425Z
            h7.kd r4 = (p124h7.AbstractC2715kd) r4
            h7.cb r0 = new h7.cb
            r2 = 3
            r0.<init>(r1, r2)
            r4.mo6602f(r5, r0)
            return
    }

    @Override // p124h7.InterfaceC2876tc
    /* renamed from: O0 */
    public final void mo6871O0(p124h7.C2603e9 r6, p124h7.InterfaceC2804pc r7) {
            r5 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r1 = r6.f11478Y
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            java.lang.String r1 = r6.f11479Z
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            java.lang.String r1 = r6.f11480a0
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            java.util.Objects.requireNonNull(r7, r0)
            f.t r0 = r5.f11682a
            java.lang.String r1 = r6.f11478Y
            java.lang.String r2 = r6.f11479Z
            java.lang.String r6 = r6.f11480a0
            h7.fc r3 = new h7.fc
            r6.a r4 = p124h7.BinderC2696jc.f11681c
            r3.<init>(r7, r4)
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            com.google.android.gms.common.internal.C1101a.m3100e(r6)
            v.c r7 = new v.c
            r7.<init>(r0, r1, r2, r3)
            r0.m4791w(r6, r7)
            return
    }

    @Override // p124h7.InterfaceC2876tc
    /* renamed from: V1 */
    public final void mo6872V1(p124h7.C2622fa r5, p124h7.InterfaceC2804pc r6) {
            r4 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r6, r0)
            java.util.Objects.requireNonNull(r5, r0)
            v9.v r5 = r5.f11511Y
            java.util.Objects.requireNonNull(r5, r0)
            f.t r0 = r4.f11682a
            h7.of r5 = p052d6.C1306f0.m3775d(r5)
            h7.fc r1 = new h7.fc
            r6.a r2 = p124h7.BinderC2696jc.f11681c
            r1.<init>(r6, r2)
            java.util.Objects.requireNonNull(r0)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r6 = r0.f8425Z
            h7.kd r6 = (p124h7.AbstractC2715kd) r6
            h7.ab r2 = new h7.ab
            r3 = 3
            r2.<init>(r0, r1, r3)
            r0 = 0
            r6.mo6615s(r0, r5, r2)
            return
    }

    @Override // p124h7.InterfaceC2876tc
    /* renamed from: b2 */
    public final void mo6873b2(p124h7.C2675i9 r5, p124h7.InterfaceC2804pc r6) {
            r4 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r6, r0)
            java.util.Objects.requireNonNull(r5, r0)
            v9.v r1 = r5.f11626Z
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.String r5 = r5.f11625Y
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            f.t r0 = r4.f11682a
            h7.of r1 = p052d6.C1306f0.m3775d(r1)
            h7.fc r2 = new h7.fc
            r6.a r3 = p124h7.BinderC2696jc.f11681c
            r2.<init>(r6, r3)
            java.util.Objects.requireNonNull(r0)
            com.google.android.gms.common.internal.C1101a.m3100e(r5)
            androidx.fragment.app.l0 r6 = new androidx.fragment.app.l0
            r6.<init>(r0, r1, r2)
            r0.m4791w(r5, r6)
            return
    }

    @Override // p124h7.InterfaceC2876tc
    /* renamed from: i0 */
    public final void mo6874i0(p124h7.C2639g9 r6, p124h7.InterfaceC2804pc r7) {
            r5 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.String r1 = r6.f11540Y
            com.google.android.gms.common.internal.C1101a.m3100e(r1)
            h7.if r1 = r6.f11541Z
            java.util.Objects.requireNonNull(r1, r0)
            java.util.Objects.requireNonNull(r7, r0)
            f.t r1 = r5.f11682a
            java.lang.String r2 = r6.f11540Y
            h7.if r6 = r6.f11541Z
            h7.fc r3 = new h7.fc
            r6.a r4 = p124h7.BinderC2696jc.f11681c
            r3.<init>(r7, r4)
            java.util.Objects.requireNonNull(r1)
            com.google.android.gms.common.internal.C1101a.m3100e(r2)
            java.util.Objects.requireNonNull(r6, r0)
            androidx.fragment.app.l0 r7 = new androidx.fragment.app.l0
            r7.<init>(r1, r6, r3)
            r1.m4791w(r2, r7)
            return
    }

    @Override // p124h7.InterfaceC2876tc
    /* renamed from: j0 */
    public final void mo6875j0(p124h7.C2586da r5, p124h7.InterfaceC2804pc r6) {
            r4 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r5, r0)
            v9.e r1 = r5.f11449Y
            java.util.Objects.requireNonNull(r1, r0)
            java.util.Objects.requireNonNull(r6, r0)
            f.t r1 = r4.f11682a
            v9.e r5 = r5.f11449Y
            h7.fc r2 = new h7.fc
            r6.a r3 = p124h7.BinderC2696jc.f11681c
            r2.<init>(r6, r3)
            java.util.Objects.requireNonNull(r1)
            java.util.Objects.requireNonNull(r5, r0)
            boolean r6 = r5.f25779c0
            if (r6 == 0) goto L2d
            java.lang.String r6 = r5.f25778b0
            androidx.fragment.app.l0 r0 = new androidx.fragment.app.l0
            r0.<init>(r1, r5, r2)
            r1.m4791w(r6, r0)
            goto L36
        L2d:
            h7.yd r6 = new h7.yd
            r0 = 0
            r6.<init>(r5, r0)
            r1.m4792x(r6, r2)
        L36:
            return
    }

    @Override // p124h7.InterfaceC2876tc
    /* renamed from: r1 */
    public final void mo6876r1(p124h7.C2891u9 r5, p124h7.InterfaceC2804pc r6) {
            r4 = this;
            java.lang.String r0 = "null reference"
            java.util.Objects.requireNonNull(r5, r0)
            java.util.Objects.requireNonNull(r6, r0)
            f.t r0 = r4.f11682a
            java.lang.String r5 = r5.f11943Y
            h7.fc r1 = new h7.fc
            r6.a r2 = p124h7.BinderC2696jc.f11681c
            r1.<init>(r6, r2)
            java.util.Objects.requireNonNull(r0)
            h7.vd r6 = new h7.vd
            r6.<init>(r5)
            java.util.Deque<java.lang.ref.WeakReference<org.xmlpull.v1.XmlPullParser>> r5 = r0.f8425Z
            h7.kd r5 = (p124h7.AbstractC2715kd) r5
            h7.ab r2 = new h7.ab
            r3 = 10
            r2.<init>(r0, r1, r3)
            r5.mo6609m(r6, r2)
            return
    }
}
