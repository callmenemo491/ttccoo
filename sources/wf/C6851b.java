package wf;

/* renamed from: wf.b */
/* loaded from: classes.dex */
public final class C6851b extends androidx.recyclerview.widget.RecyclerView.AbstractC0549e<wf.AbstractC6857e<?>> {

    /* renamed from: d */
    public final mh.InterfaceC4620l<io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI, ch.C0985l> f26604d;

    /* renamed from: e */
    public boolean f26605e;

    /* renamed from: f */
    public java.util.List<io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI> f26606f;

    public C6851b(mh.InterfaceC4620l<? super io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI, ch.C0985l> r1) {
            r0 = this;
            r0.<init>()
            r0.f26604d = r1
            r1 = 1
            r0.f26605e = r1
            dh.k r1 = p062dh.C1475k.f7237Y
            r0.f26606f = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: b */
    public int mo1521b() {
            r1 = this;
            java.util.List<io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI> r0 = r1.f26606f
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: d */
    public int mo1522d(int r1) {
            r0 = this;
            boolean r1 = r0.f26605e
            r1 = r1 ^ 1
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: e */
    public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r3, int r4) {
            r2 = this;
            wf.e r3 = (wf.AbstractC6857e) r3
            java.lang.String r0 = "holder"
            p214m2.C4339q.m9706k(r3, r0)
            java.util.List<io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI> r0 = r2.f26606f
            java.lang.Object r0 = r0.get(r4)
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTAssetUI r0 = (io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTAssetUI) r0
            r3.mo13917x(r0)
            B extends w1.a r3 = r3.f26611u
            android.view.View r3 = r3.mo1053b()
            java.lang.String r0 = "holder.binding.root"
            p214m2.C4339q.m9705j(r3, r0)
            r0 = 0
            wf.a r1 = new wf.a
            r1.<init>(r2, r4)
            r4 = 1
            vg.C6664e.m13509j(r3, r0, r1, r4)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: g */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 mo1524g(android.view.ViewGroup r23, int r24) {
            r22 = this;
            r0 = r23
            r1 = r24
            java.lang.String r2 = "parent"
            p214m2.C4339q.m9706k(r0, r2)
            android.content.Context r2 = r23.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            r3 = 2131362768(0x7f0a03d0, float:1.8345326E38)
            java.lang.String r4 = "Missing required view with ID: "
            r5 = 0
            r6 = 2131362042(0x7f0a00fa, float:1.8343853E38)
            r7 = 2131362108(0x7f0a013c, float:1.8343987E38)
            r8 = 2131362244(0x7f0a01c4, float:1.8344263E38)
            r9 = 2131362262(0x7f0a01d6, float:1.83443E38)
            r10 = 2131362350(0x7f0a022e, float:1.8344478E38)
            r11 = 2131362439(0x7f0a0287, float:1.8344659E38)
            if (r1 == 0) goto Lba
            r12 = 1
            if (r1 != r12) goto Lb2
            wf.d r1 = new wf.d
            r12 = 2131558610(0x7f0d00d2, float:1.874254E38)
            android.view.View r0 = r2.inflate(r12, r0, r5)
            android.view.View r2 = p064e.C1494h.m4055f(r0, r6)
            r14 = r2
            androidx.appcompat.widget.AppCompatTextView r14 = (androidx.appcompat.widget.AppCompatTextView) r14
            if (r14 == 0) goto L9d
            android.view.View r2 = p064e.C1494h.m4055f(r0, r7)
            r15 = r2
            androidx.appcompat.widget.AppCompatTextView r15 = (androidx.appcompat.widget.AppCompatTextView) r15
            if (r15 == 0) goto L99
            android.view.View r2 = p064e.C1494h.m4055f(r0, r8)
            r16 = r2
            androidx.appcompat.widget.AppCompatImageView r16 = (androidx.appcompat.widget.AppCompatImageView) r16
            if (r16 == 0) goto L95
            android.view.View r2 = p064e.C1494h.m4055f(r0, r9)
            r17 = r2
            androidx.appcompat.widget.AppCompatImageView r17 = (androidx.appcompat.widget.AppCompatImageView) r17
            if (r17 == 0) goto L91
            android.view.View r2 = p064e.C1494h.m4055f(r0, r10)
            r18 = r2
            androidx.appcompat.widget.AppCompatTextView r18 = (androidx.appcompat.widget.AppCompatTextView) r18
            if (r18 == 0) goto L8d
            android.view.View r2 = p064e.C1494h.m4055f(r0, r11)
            r19 = r2
            androidx.appcompat.widget.AppCompatTextView r19 = (androidx.appcompat.widget.AppCompatTextView) r19
            if (r19 == 0) goto L89
            android.view.View r2 = p064e.C1494h.m4055f(r0, r3)
            r20 = r2
            androidx.appcompat.widget.AppCompatTextView r20 = (androidx.appcompat.widget.AppCompatTextView) r20
            if (r20 == 0) goto La0
            jd.l0 r2 = new jd.l0
            r13 = r0
            com.google.android.material.card.MaterialCardView r13 = (com.google.android.material.card.MaterialCardView) r13
            r12 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r1.<init>(r2)
            goto L120
        L89:
            r3 = 2131362439(0x7f0a0287, float:1.8344659E38)
            goto La0
        L8d:
            r3 = 2131362350(0x7f0a022e, float:1.8344478E38)
            goto La0
        L91:
            r3 = 2131362262(0x7f0a01d6, float:1.83443E38)
            goto La0
        L95:
            r3 = 2131362244(0x7f0a01c4, float:1.8344263E38)
            goto La0
        L99:
            r3 = 2131362108(0x7f0a013c, float:1.8343987E38)
            goto La0
        L9d:
            r3 = 2131362042(0x7f0a00fa, float:1.8343853E38)
        La0:
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getResourceName(r3)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = r4.concat(r0)
            r1.<init>(r0)
            throw r1
        Lb2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Item adapter UNKNOWN"
            r0.<init>(r1)
            throw r0
        Lba:
            wf.c r1 = new wf.c
            r12 = 2131558609(0x7f0d00d1, float:1.8742539E38)
            android.view.View r0 = r2.inflate(r12, r0, r5)
            r2 = 2131361999(0x7f0a00cf, float:1.8343766E38)
            android.view.View r5 = p064e.C1494h.m4055f(r0, r2)
            r14 = r5
            com.google.android.material.card.MaterialCardView r14 = (com.google.android.material.card.MaterialCardView) r14
            if (r14 == 0) goto L139
            android.view.View r2 = p064e.C1494h.m4055f(r0, r6)
            r15 = r2
            androidx.appcompat.widget.AppCompatTextView r15 = (androidx.appcompat.widget.AppCompatTextView) r15
            if (r15 == 0) goto L135
            android.view.View r2 = p064e.C1494h.m4055f(r0, r7)
            r16 = r2
            androidx.appcompat.widget.AppCompatTextView r16 = (androidx.appcompat.widget.AppCompatTextView) r16
            if (r16 == 0) goto L131
            android.view.View r2 = p064e.C1494h.m4055f(r0, r8)
            r17 = r2
            androidx.appcompat.widget.AppCompatImageView r17 = (androidx.appcompat.widget.AppCompatImageView) r17
            if (r17 == 0) goto L12d
            android.view.View r2 = p064e.C1494h.m4055f(r0, r9)
            r18 = r2
            androidx.appcompat.widget.AppCompatImageView r18 = (androidx.appcompat.widget.AppCompatImageView) r18
            if (r18 == 0) goto L129
            android.view.View r2 = p064e.C1494h.m4055f(r0, r10)
            r19 = r2
            androidx.appcompat.widget.AppCompatTextView r19 = (androidx.appcompat.widget.AppCompatTextView) r19
            if (r19 == 0) goto L125
            android.view.View r2 = p064e.C1494h.m4055f(r0, r11)
            r20 = r2
            androidx.appcompat.widget.AppCompatTextView r20 = (androidx.appcompat.widget.AppCompatTextView) r20
            if (r20 == 0) goto L121
            android.view.View r2 = p064e.C1494h.m4055f(r0, r3)
            r21 = r2
            androidx.appcompat.widget.AppCompatTextView r21 = (androidx.appcompat.widget.AppCompatTextView) r21
            if (r21 == 0) goto L13c
            jd.k0 r2 = new jd.k0
            r13 = r0
            com.google.android.material.card.MaterialCardView r13 = (com.google.android.material.card.MaterialCardView) r13
            r12 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r1.<init>(r2)
        L120:
            return r1
        L121:
            r3 = 2131362439(0x7f0a0287, float:1.8344659E38)
            goto L13c
        L125:
            r3 = 2131362350(0x7f0a022e, float:1.8344478E38)
            goto L13c
        L129:
            r3 = 2131362262(0x7f0a01d6, float:1.83443E38)
            goto L13c
        L12d:
            r3 = 2131362244(0x7f0a01c4, float:1.8344263E38)
            goto L13c
        L131:
            r3 = 2131362108(0x7f0a013c, float:1.8343987E38)
            goto L13c
        L135:
            r3 = 2131362042(0x7f0a00fa, float:1.8343853E38)
            goto L13c
        L139:
            r3 = 2131361999(0x7f0a00cf, float:1.8343766E38)
        L13c:
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r0 = r0.getResourceName(r3)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = r4.concat(r0)
            r1.<init>(r0)
            throw r1
    }
}
