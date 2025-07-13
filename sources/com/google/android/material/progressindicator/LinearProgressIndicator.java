package com.google.android.material.progressindicator;

/* loaded from: classes.dex */
public final class LinearProgressIndicator extends p250o8.AbstractC5158b<p250o8.C5176t> {

    /* renamed from: m0 */
    public static final /* synthetic */ int f6253m0 = 0;

    public LinearProgressIndicator(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r0 = 2132017949(0x7f14031d, float:1.967419E38)
            r1 = 2130969197(0x7f04026d, float:1.754707E38)
            r3.<init>(r4, r5, r1, r0)
            android.content.Context r4 = r3.getContext()
            S extends o8.c r5 = r3.f20213a0
            o8.t r5 = (p250o8.C5176t) r5
            o8.n r0 = new o8.n
            o8.o r1 = new o8.o
            r1.<init>(r5)
            int r2 = r5.f20303g
            if (r2 != 0) goto L22
            o8.q r2 = new o8.q
            r2.<init>(r5)
            goto L27
        L22:
            o8.s r2 = new o8.s
            r2.<init>(r4, r5)
        L27:
            r0.<init>(r4, r5, r1, r2)
            r3.setIndeterminateDrawable(r0)
            android.content.Context r4 = r3.getContext()
            S extends o8.c r5 = r3.f20213a0
            o8.t r5 = (p250o8.C5176t) r5
            o8.i r0 = new o8.i
            o8.o r1 = new o8.o
            r1.<init>(r5)
            r0.<init>(r4, r5, r1)
            r3.setProgressDrawable(r0)
            return
    }

    @Override // p250o8.AbstractC5158b
    /* renamed from: b */
    public p250o8.AbstractC5159c mo3495b(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            o8.t r0 = new o8.t
            r0.<init>(r2, r3)
            return r0
    }

    @Override // p250o8.AbstractC5158b
    /* renamed from: c */
    public void mo3496c(int r2, boolean r3) {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            if (r0 == 0) goto L11
            o8.t r0 = (p250o8.C5176t) r0
            int r0 = r0.f20303g
            if (r0 != 0) goto L11
            boolean r0 = r1.isIndeterminate()
            if (r0 == 0) goto L11
            return
        L11:
            super.mo3496c(r2, r3)
            return
    }

    public int getIndeterminateAnimationType() {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            o8.t r0 = (p250o8.C5176t) r0
            int r0 = r0.f20303g
            return r0
    }

    public int getIndicatorDirection() {
            r1 = this;
            S extends o8.c r0 = r1.f20213a0
            o8.t r0 = (p250o8.C5176t) r0
            int r0 = r0.f20304h
            return r0
    }

    @Override // android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            S extends o8.c r1 = r0.f20213a0
            r2 = r1
            o8.t r2 = (p250o8.C5176t) r2
            o8.t r1 = (p250o8.C5176t) r1
            int r1 = r1.f20304h
            r3 = 1
            if (r1 == r3) goto L31
            java.util.WeakHashMap<android.view.View, n0.w> r1 = p227n0.C4661t.f18570a
            int r1 = p227n0.C4661t.d.m10575d(r0)
            if (r1 != r3) goto L20
            S extends o8.c r1 = r0.f20213a0
            o8.t r1 = (p250o8.C5176t) r1
            int r1 = r1.f20304h
            r4 = 2
            if (r1 == r4) goto L31
        L20:
            int r1 = p227n0.C4661t.d.m10575d(r0)
            if (r1 != 0) goto L30
            S extends o8.c r1 = r0.f20213a0
            o8.t r1 = (p250o8.C5176t) r1
            int r1 = r1.f20304h
            r4 = 3
            if (r1 != r4) goto L30
            goto L31
        L30:
            r3 = 0
        L31:
            r2.f20305i = r3
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            int r3 = r0.getPaddingLeft()
            int r4 = r0.getPaddingRight()
            int r4 = r4 + r3
            int r1 = r1 - r4
            int r3 = r0.getPaddingTop()
            int r4 = r0.getPaddingBottom()
            int r4 = r4 + r3
            int r2 = r2 - r4
            o8.n r3 = r0.getIndeterminateDrawable()
            r4 = 0
            if (r3 == 0) goto L1e
            r3.setBounds(r4, r4, r1, r2)
        L1e:
            o8.i r3 = r0.getProgressDrawable()
            if (r3 == 0) goto L27
            r3.setBounds(r4, r4, r1, r2)
        L27:
            return
    }

    public void setIndeterminateAnimationType(int r4) {
            r3 = this;
            S extends o8.c r0 = r3.f20213a0
            o8.t r0 = (p250o8.C5176t) r0
            int r0 = r0.f20303g
            if (r0 != r4) goto L9
            return
        L9:
            boolean r0 = r3.m11468d()
            if (r0 == 0) goto L1e
            boolean r0 = r3.isIndeterminate()
            if (r0 != 0) goto L16
            goto L1e
        L16:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode."
            r4.<init>(r0)
            throw r4
        L1e:
            S extends o8.c r0 = r3.f20213a0
            o8.t r0 = (p250o8.C5176t) r0
            r0.f20303g = r4
            r0.mo11470a()
            if (r4 != 0) goto L37
            o8.n r4 = r3.getIndeterminateDrawable()
            o8.q r0 = new o8.q
            S extends o8.c r1 = r3.f20213a0
            o8.t r1 = (p250o8.C5176t) r1
            r0.<init>(r1)
            goto L48
        L37:
            o8.n r4 = r3.getIndeterminateDrawable()
            o8.s r0 = new o8.s
            android.content.Context r1 = r3.getContext()
            S extends o8.c r2 = r3.f20213a0
            o8.t r2 = (p250o8.C5176t) r2
            r0.<init>(r1, r2)
        L48:
            r4.f20279k0 = r0
            r0.f17200a = r4
            r3.invalidate()
            return
    }

    @Override // p250o8.AbstractC5158b
    public void setIndicatorColor(int... r1) {
            r0 = this;
            super.setIndicatorColor(r1)
            S extends o8.c r1 = r0.f20213a0
            o8.t r1 = (p250o8.C5176t) r1
            r1.mo11470a()
            return
    }

    public void setIndicatorDirection(int r5) {
            r4 = this;
            S extends o8.c r0 = r4.f20213a0
            r1 = r0
            o8.t r1 = (p250o8.C5176t) r1
            r1.f20304h = r5
            o8.t r0 = (p250o8.C5176t) r0
            r1 = 1
            if (r5 == r1) goto L28
            java.util.WeakHashMap<android.view.View, n0.w> r2 = p227n0.C4661t.f18570a
            int r2 = p227n0.C4661t.d.m10575d(r4)
            if (r2 != r1) goto L1d
            S extends o8.c r2 = r4.f20213a0
            o8.t r2 = (p250o8.C5176t) r2
            int r2 = r2.f20304h
            r3 = 2
            if (r2 == r3) goto L28
        L1d:
            int r2 = p227n0.C4661t.d.m10575d(r4)
            if (r2 != 0) goto L27
            r2 = 3
            if (r5 != r2) goto L27
            goto L28
        L27:
            r1 = 0
        L28:
            r0.f20305i = r1
            r4.invalidate()
            return
    }

    @Override // p250o8.AbstractC5158b
    public void setTrackCornerRadius(int r1) {
            r0 = this;
            super.setTrackCornerRadius(r1)
            S extends o8.c r1 = r0.f20213a0
            o8.t r1 = (p250o8.C5176t) r1
            r1.mo11470a()
            r0.invalidate()
            return
    }
}
