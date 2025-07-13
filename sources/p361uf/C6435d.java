package p361uf;

/* renamed from: uf.d */
/* loaded from: classes.dex */
public final class C6435d extends androidx.recyclerview.widget.RecyclerView.AbstractC0549e<p361uf.C6439h> {

    /* renamed from: d */
    public java.util.List<? extends ch.C0978e<java.lang.String, ? extends io.tacocrypto.app.p156ui.tools.nftwallet.detail.EnumC3335o>> f24982d;

    public C6435d() {
            r1 = this;
            r1.<init>()
            dh.k r0 = p062dh.C1475k.f7237Y
            r1.f24982d = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: b */
    public int mo1521b() {
            r1 = this;
            java.util.List<? extends ch.e<java.lang.String, ? extends io.tacocrypto.app.ui.tools.nftwallet.detail.o>> r0 = r1.f24982d
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: e */
    public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r8, int r9) {
            r7 = this;
            uf.h r8 = (p361uf.C6439h) r8
            java.lang.String r0 = "holder"
            p214m2.C4339q.m9706k(r8, r0)
            java.util.List<? extends ch.e<java.lang.String, ? extends io.tacocrypto.app.ui.tools.nftwallet.detail.o>> r0 = r7.f24982d
            java.lang.Object r0 = r0.get(r9)
            ch.e r0 = (ch.C0978e) r0
            java.lang.String r1 = "item"
            p214m2.C4339q.m9706k(r0, r1)
            android.view.View r8 = r8.f3208a
            r1 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r2 = p064e.C1494h.m4055f(r8, r1)
            androidx.appcompat.widget.AppCompatImageView r2 = (androidx.appcompat.widget.AppCompatImageView) r2
            if (r2 == 0) goto L81
            r1 = 2131362264(0x7f0a01d8, float:1.8344304E38)
            android.view.View r3 = p064e.C1494h.m4055f(r8, r1)
            androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
            if (r3 == 0) goto L81
            jd.h r1 = new jd.h
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            r1.<init>(r8, r2, r3)
            B r8 = r0.f5051Z
            io.tacocrypto.app.ui.tools.nftwallet.detail.o r4 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.EnumC3335o.f14463Y
            r5 = 0
            if (r8 != r4) goto L3f
            A r4 = r0.f5050Y
            java.lang.String r4 = (java.lang.String) r4
            goto L40
        L3f:
            r4 = r5
        L40:
            io.tacocrypto.app.ui.tools.nftwallet.detail.o r6 = io.tacocrypto.app.p156ui.tools.nftwallet.detail.EnumC3335o.f14464Z
            if (r8 != r6) goto L49
            A r8 = r0.f5050Y
            java.lang.String r8 = (java.lang.String) r8
            goto L4a
        L49:
            r8 = r5
        L4a:
            java.lang.String r0 = "requestSettings"
            java.lang.String r6 = "imageViewCached"
            p214m2.C4339q.m9705j(r3, r6)
            if (r9 != 0) goto L65
            h7.of r9 = vg.C6672m.m13525l(r3, r5, r5)
            uf.e r3 = new uf.e
            r3.<init>(r1, r4)
            p214m2.C4339q.m9706k(r3, r0)
            r9.f11814b0 = r3
            r9.m7026c()
            goto L6a
        L65:
            r9 = 8
            r3.setVisibility(r9)
        L6a:
            java.lang.String r9 = "imageView"
            p214m2.C4339q.m9705j(r2, r9)
            h7.of r8 = vg.C6672m.m13525l(r2, r4, r8)
            uf.g r9 = new uf.g
            r9.<init>(r1)
            p214m2.C4339q.m9706k(r9, r0)
            r8.f11814b0 = r9
            r8.m7026c()
            return
        L81:
            android.content.res.Resources r8 = r8.getResources()
            java.lang.String r8 = r8.getResourceName(r1)
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r8 = r0.concat(r8)
            r9.<init>(r8)
            throw r9
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: g */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 mo1524g(android.view.ViewGroup r3, int r4) {
            r2 = this;
            java.lang.String r4 = "parent"
            p214m2.C4339q.m9706k(r3, r4)
            android.content.Context r4 = r3.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131558566(0x7f0d00a6, float:1.8742451E38)
            r1 = 0
            android.view.View r3 = r4.inflate(r0, r3, r1)
            uf.h r4 = new uf.h
            java.lang.String r0 = "view"
            p214m2.C4339q.m9705j(r3, r0)
            r4.<init>(r3)
            return r4
    }
}
