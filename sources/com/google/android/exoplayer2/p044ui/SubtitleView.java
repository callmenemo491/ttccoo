package com.google.android.exoplayer2.p044ui;

/* loaded from: classes.dex */
public final class SubtitleView extends android.widget.FrameLayout implements p088f4.InterfaceC2054x0.e {

    /* renamed from: a0 */
    public java.util.List<p143i5.C3077a> f5292a0;

    /* renamed from: b0 */
    public p337t5.C6171a f5293b0;

    /* renamed from: c0 */
    public int f5294c0;

    /* renamed from: d0 */
    public float f5295d0;

    /* renamed from: e0 */
    public float f5296e0;

    /* renamed from: f0 */
    public boolean f5297f0;

    /* renamed from: g0 */
    public boolean f5298g0;

    /* renamed from: h0 */
    public int f5299h0;

    /* renamed from: i0 */
    public com.google.android.exoplayer2.p044ui.SubtitleView.InterfaceC1049a f5300i0;

    /* renamed from: j0 */
    public android.view.View f5301j0;

    /* renamed from: com.google.android.exoplayer2.ui.SubtitleView$a */
    public interface InterfaceC1049a {
        /* renamed from: a */
        void mo2917a(java.util.List<p143i5.C3077a> r1, p337t5.C6171a r2, float r3, int r4, float r5);
    }

    public SubtitleView(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            java.util.List r4 = java.util.Collections.emptyList()
            r2.f5292a0 = r4
            t5.a r4 = p337t5.C6171a.f23900g
            r2.f5293b0 = r4
            r4 = 0
            r2.f5294c0 = r4
            r4 = 1029329178(0x3d5a511a, float:0.0533)
            r2.f5295d0 = r4
            r4 = 1034147594(0x3da3d70a, float:0.08)
            r2.f5296e0 = r4
            r4 = 1
            r2.f5297f0 = r4
            r2.f5298g0 = r4
            com.google.android.exoplayer2.ui.a r0 = new com.google.android.exoplayer2.ui.a
            r1 = 0
            r0.<init>(r3, r1)
            r2.f5300i0 = r0
            r2.f5301j0 = r0
            r2.addView(r0)
            r2.f5299h0 = r4
            return
    }

    /* renamed from: getCuesWithStylingPreferencesApplied */
    private java.util.List<p143i5.C3077a> m2884xf0211d97() {
            r10 = this;
            boolean r0 = r10.f5297f0
            if (r0 == 0) goto Lb
            boolean r0 = r10.f5298g0
            if (r0 == 0) goto Lb
            java.util.List<i5.a> r0 = r10.f5292a0
            return r0
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<i5.a> r1 = r10.f5292a0
            int r1 = r1.size()
            r0.<init>(r1)
            r1 = 0
            r2 = 0
        L18:
            java.util.List<i5.a> r3 = r10.f5292a0
            int r3 = r3.size()
            if (r2 >= r3) goto L7a
            java.util.List<i5.a> r3 = r10.f5292a0
            java.lang.Object r3 = r3.get(r2)
            i5.a r3 = (p143i5.C3077a) r3
            i5.a$b r3 = r3.m7534a()
            boolean r4 = r10.f5297f0
            if (r4 != 0) goto L69
            r3.f12416n = r1
            java.lang.CharSequence r4 = r3.f12403a
            boolean r5 = r4 instanceof android.text.Spanned
            if (r5 == 0) goto L65
            boolean r5 = r4 instanceof android.text.Spannable
            if (r5 != 0) goto L42
            android.text.SpannableString r4 = android.text.SpannableString.valueOf(r4)
            r3.f12403a = r4
        L42:
            java.lang.CharSequence r4 = r3.f12403a
            java.util.Objects.requireNonNull(r4)
            android.text.Spannable r4 = (android.text.Spannable) r4
            int r5 = r4.length()
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            java.lang.Object[] r5 = r4.getSpans(r1, r5, r6)
            int r6 = r5.length
            r7 = 0
        L55:
            if (r7 >= r6) goto L65
            r8 = r5[r7]
            boolean r9 = r8 instanceof p217m5.InterfaceC4383b
            r9 = r9 ^ 1
            if (r9 == 0) goto L62
            r4.removeSpan(r8)
        L62:
            int r7 = r7 + 1
            goto L55
        L65:
            p337t5.C6178h.m12746a(r3)
            goto L70
        L69:
            boolean r4 = r10.f5298g0
            if (r4 != 0) goto L70
            p337t5.C6178h.m12746a(r3)
        L70:
            i5.a r3 = r3.m7535a()
            r0.add(r3)
            int r2 = r2 + 1
            goto L18
        L7a:
            return r0
    }

    private float getUserCaptionFontScale() {
            r3 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 19
            if (r0 < r2) goto L27
            boolean r0 = r3.isInEditMode()
            if (r0 == 0) goto Lf
            goto L27
        Lf:
            android.content.Context r0 = r3.getContext()
            java.lang.String r2 = "captioning"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.accessibility.CaptioningManager r0 = (android.view.accessibility.CaptioningManager) r0
            if (r0 == 0) goto L27
            boolean r2 = r0.isEnabled()
            if (r2 == 0) goto L27
            float r1 = r0.getFontScale()
        L27:
            return r1
    }

    private p337t5.C6171a getUserCaptionStyle() {
            r17 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 19
            if (r0 < r1) goto L88
            boolean r1 = r17.isInEditMode()
            if (r1 == 0) goto Le
            goto L88
        Le:
            android.content.Context r1 = r17.getContext()
            java.lang.String r2 = "captioning"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.CaptioningManager r1 = (android.view.accessibility.CaptioningManager) r1
            if (r1 == 0) goto L85
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L85
            android.view.accessibility.CaptioningManager$CaptionStyle r1 = r1.getUserStyle()
            r2 = 21
            if (r0 < r2) goto L71
            t5.a r0 = new t5.a
            boolean r2 = r1.hasForegroundColor()
            r3 = -1
            if (r2 == 0) goto L37
            int r2 = r1.foregroundColor
            r4 = r2
            goto L38
        L37:
            r4 = -1
        L38:
            boolean r2 = r1.hasBackgroundColor()
            if (r2 == 0) goto L42
            int r2 = r1.backgroundColor
            r5 = r2
            goto L46
        L42:
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r5 = -16777216(0xffffffffff000000, float:-1.7014118E38)
        L46:
            boolean r2 = r1.hasWindowColor()
            r6 = 0
            if (r2 == 0) goto L50
            int r2 = r1.windowColor
            goto L51
        L50:
            r2 = 0
        L51:
            boolean r7 = r1.hasEdgeType()
            if (r7 == 0) goto L5b
            int r6 = r1.edgeType
            r7 = r6
            goto L5c
        L5b:
            r7 = 0
        L5c:
            boolean r6 = r1.hasEdgeColor()
            if (r6 == 0) goto L66
            int r3 = r1.edgeColor
            r8 = r3
            goto L67
        L66:
            r8 = -1
        L67:
            android.graphics.Typeface r9 = r1.getTypeface()
            r3 = r0
            r6 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9)
            goto L87
        L71:
            t5.a r0 = new t5.a
            int r11 = r1.foregroundColor
            int r12 = r1.backgroundColor
            int r14 = r1.edgeType
            int r15 = r1.edgeColor
            android.graphics.Typeface r16 = r1.getTypeface()
            r13 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16)
            goto L87
        L85:
            t5.a r0 = p337t5.C6171a.f23900g
        L87:
            return r0
        L88:
            t5.a r0 = p337t5.C6171a.f23900g
            return r0
    }

    private <T extends android.view.View & com.google.android.exoplayer2.p044ui.SubtitleView.InterfaceC1049a> void setView(T r3) {
            r2 = this;
            android.view.View r0 = r2.f5301j0
            r2.removeView(r0)
            android.view.View r0 = r2.f5301j0
            boolean r1 = r0 instanceof com.google.android.exoplayer2.p044ui.C1055c
            if (r1 == 0) goto L12
            com.google.android.exoplayer2.ui.c r0 = (com.google.android.exoplayer2.p044ui.C1055c) r0
            android.webkit.WebView r0 = r0.f5330b0
            r0.destroy()
        L12:
            r2.f5301j0 = r3
            r0 = r3
            com.google.android.exoplayer2.ui.SubtitleView$a r0 = (com.google.android.exoplayer2.p044ui.SubtitleView.InterfaceC1049a) r0
            r2.f5300i0 = r0
            r2.addView(r3)
            return
    }

    @Override // p088f4.InterfaceC2054x0.e
    /* renamed from: F */
    public /* synthetic */ void mo2885F(p121h4.C2461d r1) {
            r0 = this;
            p088f4.C2058z0.m5462a(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.e
    /* renamed from: M */
    public /* synthetic */ void mo2886M(p088f4.C2032o r1) {
            r0 = this;
            p088f4.C2058z0.m5465d(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: N */
    public /* synthetic */ void mo2887N(int r1) {
            r0 = this;
            p088f4.C2058z0.m5475n(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: O */
    public /* synthetic */ void mo2888O(boolean r1, int r2) {
            r0 = this;
            p088f4.C2058z0.m5473l(r0, r1, r2)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: Q */
    public /* synthetic */ void mo2889Q(p088f4.InterfaceC2054x0.f r1, p088f4.InterfaceC2054x0.f r2, int r3) {
            r0 = this;
            p088f4.C2058z0.m5479r(r0, r1, r2, r3)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: R */
    public /* synthetic */ void mo2890R(p088f4.InterfaceC2054x0 r1, p088f4.InterfaceC2054x0.d r2) {
            r0 = this;
            p088f4.C2058z0.m5467f(r0, r1, r2)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: S */
    public /* synthetic */ void mo2891S(p088f4.InterfaceC2054x0.b r1) {
            r0 = this;
            p088f4.C2058z0.m5463b(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: T */
    public /* synthetic */ void mo2892T(p088f4.C2034o1 r1) {
            r0 = this;
            p088f4.C2058z0.m5486y(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: U */
    public /* synthetic */ void mo2893U(p108g5.C2273i0 r1, p325s5.C5970j r2) {
            r0 = this;
            p088f4.C2056y0.m5444u(r0, r1, r2)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: X */
    public /* synthetic */ void mo2894X(boolean r1) {
            r0 = this;
            p088f4.C2058z0.m5482u(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: Y */
    public /* synthetic */ void mo2895Y(p088f4.C2048u0 r1) {
            r0 = this;
            p088f4.C2058z0.m5477p(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.e
    /* renamed from: Z */
    public /* synthetic */ void mo2896Z(int r1, int r2) {
            r0 = this;
            p088f4.C2058z0.m5484w(r0, r1, r2)
            return
    }

    @Override // p088f4.InterfaceC2054x0.e
    /* renamed from: a */
    public /* synthetic */ void mo2897a() {
            r0 = this;
            p088f4.C2058z0.m5480s(r0)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: a0 */
    public /* synthetic */ void mo2898a0(p088f4.C2018j0 r1, int r2) {
            r0 = this;
            p088f4.C2058z0.m5470i(r0, r1, r2)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: b */
    public /* synthetic */ void mo2899b() {
            r0 = this;
            p088f4.C2056y0.m5441r(r0)
            return
    }

    @Override // p088f4.InterfaceC2054x0.e
    /* renamed from: c */
    public /* synthetic */ void mo2900c(boolean r1) {
            r0 = this;
            p088f4.C2058z0.m5483v(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.e
    /* renamed from: d */
    public void mo2901d(java.util.List<p143i5.C3077a> r1) {
            r0 = this;
            r0.setCues(r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.e
    /* renamed from: e */
    public /* synthetic */ void mo2902e(p387w5.C6813p r1) {
            r0 = this;
            p088f4.C2058z0.m5487z(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.e
    /* renamed from: f */
    public /* synthetic */ void mo2903f(p427y4.C7110a r1) {
            r0 = this;
            p088f4.C2058z0.m5472k(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: f0 */
    public /* synthetic */ void mo2904f0(p088f4.C2052w0 r1) {
            r0 = this;
            p088f4.C2058z0.m5474m(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: g */
    public /* synthetic */ void mo2905g(int r1) {
            r0 = this;
            p088f4.C2058z0.m5476o(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: h */
    public /* synthetic */ void mo2906h(boolean r1, int r2) {
            r0 = this;
            p088f4.C2056y0.m5437n(r0, r1, r2)
            return
    }

    /* renamed from: i */
    public final void m2907i() {
            r6 = this;
            com.google.android.exoplayer2.ui.SubtitleView$a r0 = r6.f5300i0
            java.util.List r1 = r6.m2884xf0211d97()
            t5.a r2 = r6.f5293b0
            float r3 = r6.f5295d0
            int r4 = r6.f5294c0
            float r5 = r6.f5296e0
            r0.mo2917a(r1, r2, r3, r4, r5)
            return
    }

    @Override // p088f4.InterfaceC2054x0.e
    /* renamed from: i0 */
    public /* synthetic */ void mo2908i0(int r1, boolean r2) {
            r0 = this;
            p088f4.C2058z0.m5466e(r0, r1, r2)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: j */
    public /* synthetic */ void mo2909j(boolean r1) {
            r0 = this;
            p088f4.C2056y0.m5428e(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: j0 */
    public /* synthetic */ void mo2910j0(boolean r1) {
            r0 = this;
            p088f4.C2058z0.m5469h(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: k */
    public /* synthetic */ void mo2911k(int r1) {
            r0 = this;
            p088f4.C2056y0.m5438o(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: n */
    public /* synthetic */ void mo2912n(p088f4.C2021k0 r1) {
            r0 = this;
            p088f4.C2058z0.m5471j(r0, r1)
            return
    }

    public void setApplyEmbeddedFontSizes(boolean r1) {
            r0 = this;
            r0.f5298g0 = r1
            r0.m2907i()
            return
    }

    public void setApplyEmbeddedStyles(boolean r1) {
            r0 = this;
            r0.f5297f0 = r1
            r0.m2907i()
            return
    }

    public void setBottomPaddingFraction(float r1) {
            r0 = this;
            r0.f5296e0 = r1
            r0.m2907i()
            return
    }

    public void setCues(java.util.List<p143i5.C3077a> r1) {
            r0 = this;
            if (r1 == 0) goto L3
            goto L7
        L3:
            java.util.List r1 = java.util.Collections.emptyList()
        L7:
            r0.f5292a0 = r1
            r0.m2907i()
            return
    }

    public void setFractionalTextSize(float r2) {
            r1 = this;
            r0 = 0
            r1.f5294c0 = r0
            r1.f5295d0 = r2
            r1.m2907i()
            return
    }

    public void setStyle(p337t5.C6171a r1) {
            r0 = this;
            r0.f5293b0 = r1
            r0.m2907i()
            return
    }

    public void setViewType(int r4) {
            r3 = this;
            int r0 = r3.f5299h0
            if (r0 != r4) goto L5
            return
        L5:
            r0 = 1
            if (r4 == r0) goto L1b
            r0 = 2
            if (r4 != r0) goto L15
            com.google.android.exoplayer2.ui.c r0 = new com.google.android.exoplayer2.ui.c
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            goto L25
        L15:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L1b:
            com.google.android.exoplayer2.ui.a r0 = new com.google.android.exoplayer2.ui.a
            android.content.Context r1 = r3.getContext()
            r2 = 0
            r0.<init>(r1, r2)
        L25:
            r3.setView(r0)
            r3.f5299h0 = r4
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: t */
    public /* synthetic */ void mo2913t(p088f4.AbstractC2031n1 r1, int r2) {
            r0 = this;
            p088f4.C2058z0.m5485x(r0, r1, r2)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: u */
    public /* synthetic */ void mo2914u(int r1) {
            r0 = this;
            p088f4.C2058z0.m5481t(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: v */
    public /* synthetic */ void mo2915v(boolean r1) {
            r0 = this;
            p088f4.C2058z0.m5468g(r0, r1)
            return
    }

    @Override // p088f4.InterfaceC2054x0.c
    /* renamed from: y */
    public /* synthetic */ void mo2916y(p088f4.C2048u0 r1) {
            r0 = this;
            p088f4.C2058z0.m5478q(r0, r1)
            return
    }
}
