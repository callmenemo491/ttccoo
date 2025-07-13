package cg;

/* renamed from: cg.c */
/* loaded from: classes.dex */
public final class C0961c extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

    /* renamed from: u */
    public final android.widget.TextView f4968u;

    /* renamed from: v */
    public final android.widget.TextView f4969v;

    /* renamed from: w */
    public final android.widget.ImageView f4970w;

    /* renamed from: x */
    public final android.widget.ImageView f4971x;

    /* renamed from: y */
    public cg.C0960b f4972y;

    /* renamed from: cg.c$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

        /* renamed from: Z */
        public final /* synthetic */ cg.C0961c f4973Z;

        /* renamed from: a0 */
        public final /* synthetic */ mh.InterfaceC4620l<cg.C0960b, ch.C0985l> f4974a0;

        public a(cg.C0961c r1, mh.InterfaceC4620l<? super cg.C0960b, ch.C0985l> r2) {
                r0 = this;
                r0.f4973Z = r1
                r0.f4974a0 = r2
                r1 = 1
                r0.<init>(r1)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public ch.C0985l mo107b(android.view.View r2) {
                r1 = this;
                android.view.View r2 = (android.view.View) r2
                java.lang.String r0 = "it"
                p214m2.C4339q.m9706k(r2, r0)
                cg.c r2 = r1.f4973Z
                cg.b r2 = r2.f4972y
                if (r2 == 0) goto L12
                mh.l<cg.b, ch.l> r0 = r1.f4974a0
                r0.mo107b(r2)
            L12:
                ch.l r2 = ch.C0985l.f5061a
                return r2
        }
    }

    public C0961c(p171jd.C3531l r3, mh.InterfaceC4620l<? super cg.C0960b, ch.C0985l> r4) {
            r2 = this;
            java.lang.String r0 = "itemClickedListener"
            p214m2.C4339q.m9706k(r4, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r3.m8001e()
            r2.<init>(r0)
            java.lang.Object r0 = r3.f15305f
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.String r1 = "binding.nameText"
            p214m2.C4339q.m9705j(r0, r1)
            r2.f4968u = r0
            java.lang.Object r0 = r3.f15306g
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.String r1 = "binding.subtitleText"
            p214m2.C4339q.m9705j(r0, r1)
            r2.f4969v = r0
            java.lang.Object r0 = r3.f15304e
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            java.lang.String r1 = "binding.imageViewCover"
            p214m2.C4339q.m9705j(r0, r1)
            r2.f4970w = r0
            java.lang.Object r0 = r3.f15303d
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            java.lang.String r1 = "binding.itemState"
            p214m2.C4339q.m9705j(r0, r1)
            r2.f4971x = r0
            androidx.constraintlayout.widget.ConstraintLayout r3 = r3.m8001e()
            java.lang.String r0 = "binding.root"
            p214m2.C4339q.m9705j(r3, r0)
            cg.c$a r0 = new cg.c$a
            r0.<init>(r2, r4)
            r4 = 0
            r1 = 1
            vg.C6664e.m13509j(r3, r4, r0, r1)
            return
    }

    /* renamed from: x */
    public final void m2678x(cg.C0960b r6) {
            r5 = this;
            int r0 = r6.f4967g
            r1 = 1
            if (r0 != r1) goto L9
            r0 = 2131099722(0x7f06004a, float:1.7811805E38)
            goto Lc
        L9:
            r0 = 2131099956(0x7f060134, float:1.781228E38)
        Lc:
            android.widget.TextView r2 = r5.f4968u
            vg.C6664e.m13510k(r2, r0)
            android.widget.ImageView r0 = r5.f4971x
            int r2 = r6.f4967g
            r3 = 2
            r4 = 0
            if (r2 == r1) goto L21
            if (r2 == r3) goto L1d
            r2 = 0
            goto L24
        L1d:
            r2 = 2131231237(0x7f080205, float:1.807855E38)
            goto L24
        L21:
            r2 = 2131231233(0x7f080201, float:1.8078541E38)
        L24:
            r0.setImageResource(r2)
            int r6 = r6.f4967g
            if (r6 == r1) goto L2f
            if (r6 != r3) goto L2e
            goto L2f
        L2e:
            r1 = 0
        L2f:
            android.widget.ImageView r6 = r5.f4971x
            if (r1 == 0) goto L34
            goto L36
        L34:
            r4 = 8
        L36:
            r6.setVisibility(r4)
            return
    }
}
