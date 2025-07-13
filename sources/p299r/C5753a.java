package p299r;

/* renamed from: r.a */
/* loaded from: classes.dex */
public class C5753a implements p299r.InterfaceC5755c {
    public C5753a() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public final p299r.C5756d m12067a(p299r.InterfaceC5754b r1) {
            r0 = this;
            androidx.cardview.widget.CardView$a r1 = (androidx.cardview.widget.CardView.C0317a) r1
            android.graphics.drawable.Drawable r1 = r1.f1519a
            r.d r1 = (p299r.C5756d) r1
            return r1
    }

    /* renamed from: b */
    public float m12068b(p299r.InterfaceC5754b r1) {
            r0 = this;
            r.d r1 = r0.m12067a(r1)
            float r1 = r1.f22159e
            return r1
    }

    /* renamed from: c */
    public float m12069c(p299r.InterfaceC5754b r1) {
            r0 = this;
            r.d r1 = r0.m12067a(r1)
            float r1 = r1.f22155a
            return r1
    }

    /* renamed from: d */
    public void m12070d(p299r.InterfaceC5754b r5, float r6) {
            r4 = this;
            r.d r0 = r4.m12067a(r5)
            r1 = r5
            androidx.cardview.widget.CardView$a r1 = (androidx.cardview.widget.CardView.C0317a) r1
            androidx.cardview.widget.CardView r2 = r1.f1520b
            boolean r2 = r2.getUseCompatPadding()
            boolean r1 = r1.m866a()
            float r3 = r0.f22159e
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 != 0) goto L20
            boolean r3 = r0.f22160f
            if (r3 != r2) goto L20
            boolean r3 = r0.f22161g
            if (r3 != r1) goto L20
            goto L2d
        L20:
            r0.f22159e = r6
            r0.f22160f = r2
            r0.f22161g = r1
            r6 = 0
            r0.m12074c(r6)
            r0.invalidateSelf()
        L2d:
            r4.m12071e(r5)
            return
    }

    /* renamed from: e */
    public void m12071e(p299r.InterfaceC5754b r6) {
            r5 = this;
            r0 = r6
            androidx.cardview.widget.CardView$a r0 = (androidx.cardview.widget.CardView.C0317a) r0
            androidx.cardview.widget.CardView r1 = r0.f1520b
            boolean r1 = r1.getUseCompatPadding()
            if (r1 != 0) goto L10
            r6 = 0
            r0.m867b(r6, r6, r6, r6)
            return
        L10:
            r.d r1 = r5.m12067a(r6)
            float r1 = r1.f22159e
            r.d r6 = r5.m12067a(r6)
            float r6 = r6.f22155a
            boolean r2 = r0.m866a()
            float r2 = p299r.C5757e.m12075a(r1, r6, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            boolean r3 = r0.m866a()
            float r6 = p299r.C5757e.m12076b(r1, r6, r3)
            double r3 = (double) r6
            double r3 = java.lang.Math.ceil(r3)
            int r6 = (int) r3
            r0.m867b(r2, r6, r2, r6)
            return
    }
}
