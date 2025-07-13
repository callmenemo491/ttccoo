package ee;

/* renamed from: ee.e */
/* loaded from: classes.dex */
public final class C1827e extends androidx.recyclerview.widget.RecyclerView.AbstractC0549e<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> {

    /* renamed from: d */
    public final mh.InterfaceC4620l<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0, ch.C0985l> f7955d;

    /* renamed from: e */
    public java.util.Set<io.tacocrypto.app.p156ui.secret.EnumC3251c> f7956e;

    /* renamed from: f */
    public java.util.List<io.tacocrypto.app.p156ui.secret.EnumC3251c> f7957f;

    /* renamed from: ee.e$a */
    public final class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final /* synthetic */ ee.C1827e f7958u;

        public a(ee.C1827e r1, android.view.View r2) {
                r0 = this;
                r0.f7958u = r1
                r0.<init>(r2)
                return
        }
    }

    public C1827e(mh.InterfaceC4620l<? super androidx.recyclerview.widget.RecyclerView.AbstractC0546b0, ch.C0985l> r1) {
            r0 = this;
            r0.<init>()
            r0.f7955d = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f7956e = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f7957f = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: b */
    public int mo1521b() {
            r1 = this;
            java.util.List<io.tacocrypto.app.ui.secret.c> r0 = r1.f7957f
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: e */
    public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r8, int r9) {
            r7 = this;
            java.lang.String r0 = "holder"
            p214m2.C4339q.m9706k(r8, r0)
            boolean r0 = r8 instanceof ee.C1827e.a
            if (r0 == 0) goto La6
            ee.e$a r8 = (ee.C1827e.a) r8
            java.util.List<io.tacocrypto.app.ui.secret.c> r0 = r7.f7957f
            java.lang.Object r0 = r0.get(r9)
            io.tacocrypto.app.ui.secret.c r0 = (io.tacocrypto.app.p156ui.secret.EnumC3251c) r0
            java.lang.String r1 = "item"
            p214m2.C4339q.m9706k(r0, r1)
            android.view.View r1 = r8.f3208a
            r2 = 2131362115(0x7f0a0143, float:1.8344001E38)
            android.view.View r3 = p064e.C1494h.m4055f(r1, r2)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            if (r3 == 0) goto L92
            r2 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r4 = p064e.C1494h.m4055f(r1, r2)
            androidx.appcompat.widget.AppCompatImageView r4 = (androidx.appcompat.widget.AppCompatImageView) r4
            if (r4 == 0) goto L92
            r2 = 2131362684(0x7f0a037c, float:1.8345156E38)
            android.view.View r5 = p064e.C1494h.m4055f(r1, r2)
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto L92
            androidx.appcompat.widget.LinearLayoutCompat r1 = (androidx.appcompat.widget.LinearLayoutCompat) r1
            ee.e r1 = r8.f7958u
            java.util.Set<io.tacocrypto.app.ui.secret.c> r1 = r1.f7956e
            boolean r1 = r1.contains(r0)
            r2 = 2131231036(0x7f08013c, float:1.8078142E38)
            r4.setImageResource(r2)
            java.lang.String r2 = "binding.imageView"
            p214m2.C4339q.m9705j(r4, r2)
            if (r1 == 0) goto L56
            r2 = 2131099722(0x7f06004a, float:1.7811805E38)
            goto L59
        L56:
            r2 = 2131099956(0x7f060134, float:1.781228E38)
        L59:
            java.lang.String r6 = "<this>"
            p214m2.C4339q.m9706k(r4, r6)
            android.content.Context r6 = r4.getContext()
            int r2 = p046d0.C1259a.m3706b(r6, r2)
            android.graphics.PorterDuff$Mode r6 = android.graphics.PorterDuff.Mode.SRC_IN
            r4.setColorFilter(r2, r6)
            if (r1 == 0) goto L70
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L73
        L70:
            r1 = 1058642330(0x3f19999a, float:0.6)
        L73:
            r4.setAlpha(r1)
            java.lang.String r0 = r0.m7732g()
            r5.setText(r0)
            ee.e r0 = r8.f7958u
            ee.c r1 = new ee.c
            r1.<init>(r0, r9)
            r4.setOnClickListener(r1)
            ee.e r9 = r8.f7958u
            ee.d r0 = new ee.d
            r0.<init>(r9, r8)
            r3.setOnTouchListener(r0)
            goto La6
        L92:
            android.content.res.Resources r8 = r1.getResources()
            java.lang.String r8 = r8.getResourceName(r2)
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r8 = r0.concat(r8)
            r9.<init>(r8)
            throw r9
        La6:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: g */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 mo1524g(android.view.ViewGroup r3, int r4) {
            r2 = this;
            java.lang.String r4 = "parent"
            p214m2.C4339q.m9706k(r3, r4)
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131558617(0x7f0d00d9, float:1.8742555E38)
            r1 = 0
            android.view.View r3 = r4.inflate(r0, r3, r1)
            ee.e$a r4 = new ee.e$a
            java.lang.String r0 = "view"
            p214m2.C4339q.m9705j(r3, r0)
            r4.<init>(r2, r3)
            return r4
    }
}
