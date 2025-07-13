package p049d3;

/* renamed from: d3.e */
/* loaded from: classes.dex */
public abstract class AbstractC1273e<Z> extends p049d3.AbstractC1276h<android.widget.ImageView, Z> {

    /* renamed from: a0 */
    public android.graphics.drawable.Animatable f6752a0;

    public AbstractC1273e(android.widget.ImageView r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    /* renamed from: a */
    public abstract void mo3729a(Z r1);

    @Override // p049d3.InterfaceC1275g
    /* renamed from: b */
    public void mo2565b(Z r1, p068e3.InterfaceC1513b<? super Z> r2) {
            r0 = this;
            r0.m3730h(r1)
            return
    }

    @Override // p049d3.AbstractC1269a, p049d3.InterfaceC1275g
    /* renamed from: c */
    public void mo2566c(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.m3730h(r0)
            T extends android.view.View r0 = r1.f6753Y
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r2)
            return
    }

    @Override // p049d3.AbstractC1269a, p445z2.InterfaceC7235i
    /* renamed from: d */
    public void mo2567d() {
            r1 = this;
            android.graphics.drawable.Animatable r0 = r1.f6752a0
            if (r0 == 0) goto L7
            r0.stop()
        L7:
            return
    }

    @Override // p049d3.AbstractC1276h, p049d3.InterfaceC1275g
    /* renamed from: f */
    public void mo2569f(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.m3730h(r0)
            T extends android.view.View r0 = r1.f6753Y
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r2)
            return
    }

    /* renamed from: h */
    public final void m3730h(Z r2) {
            r1 = this;
            r1.mo3729a(r2)
            boolean r0 = r2 instanceof android.graphics.drawable.Animatable
            if (r0 == 0) goto Lf
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
            r1.f6752a0 = r2
            r2.start()
            goto L12
        Lf:
            r2 = 0
            r1.f6752a0 = r2
        L12:
            return
    }

    @Override // p049d3.AbstractC1276h, p049d3.InterfaceC1275g
    /* renamed from: k */
    public void mo2574k(android.graphics.drawable.Drawable r2) {
            r1 = this;
            d3.h$a r0 = r1.f6754Z
            r0.m3731a()
            android.graphics.drawable.Animatable r0 = r1.f6752a0
            if (r0 == 0) goto Lc
            r0.stop()
        Lc:
            r0 = 0
            r1.m3730h(r0)
            T extends android.view.View r0 = r1.f6753Y
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r0.setImageDrawable(r2)
            return
    }

    @Override // p049d3.AbstractC1269a, p445z2.InterfaceC7235i
    /* renamed from: l */
    public void mo2575l() {
            r1 = this;
            android.graphics.drawable.Animatable r0 = r1.f6752a0
            if (r0 == 0) goto L7
            r0.start()
        L7:
            return
    }
}
