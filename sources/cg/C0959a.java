package cg;

/* renamed from: cg.a */
/* loaded from: classes.dex */
public final class C0959a extends androidx.recyclerview.widget.AbstractC0613x<cg.C0960b, cg.C0961c> {

    /* renamed from: f */
    public final mh.InterfaceC4620l<cg.C0960b, ch.C0985l> f4959f;

    public C0959a(mh.InterfaceC4620l<? super cg.C0960b, ch.C0985l> r2) {
            r1 = this;
            androidx.recyclerview.widget.o$e<cg.b> r0 = cg.C0960b.f4960h
            r1.<init>(r0)
            r1.f4959f = r2
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: e */
    public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r2, int r3) {
            r1 = this;
            cg.c r2 = (cg.C0961c) r2
            java.lang.String r0 = "holder"
            p214m2.C4339q.m9706k(r2, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.m2677j(r2, r3, r0)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: f */
    public /* bridge */ /* synthetic */ void mo1811f(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r1, int r2, java.util.List r3) {
            r0 = this;
            cg.c r1 = (cg.C0961c) r1
            r0.m2677j(r1, r2, r3)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: g */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 mo1524g(android.view.ViewGroup r9, int r10) {
            r8 = this;
            java.lang.String r10 = "parent"
            p214m2.C4339q.m9706k(r9, r10)
            android.content.Context r10 = r9.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r0 = 2131558612(0x7f0d00d4, float:1.8742545E38)
            r1 = 0
            android.view.View r9 = r10.inflate(r0, r9, r1)
            r10 = 2131361994(0x7f0a00ca, float:1.8343756E38)
            android.view.View r0 = p064e.C1494h.m4055f(r9, r10)
            r3 = r0
            androidx.cardview.widget.CardView r3 = (androidx.cardview.widget.CardView) r3
            if (r3 == 0) goto L62
            r10 = 2131362266(0x7f0a01da, float:1.8344308E38)
            android.view.View r0 = p064e.C1494h.m4055f(r9, r10)
            r4 = r0
            androidx.appcompat.widget.AppCompatImageView r4 = (androidx.appcompat.widget.AppCompatImageView) r4
            if (r4 == 0) goto L62
            r10 = 2131362278(0x7f0a01e6, float:1.8344332E38)
            android.view.View r0 = p064e.C1494h.m4055f(r9, r10)
            r5 = r0
            androidx.appcompat.widget.AppCompatImageView r5 = (androidx.appcompat.widget.AppCompatImageView) r5
            if (r5 == 0) goto L62
            r10 = 2131362439(0x7f0a0287, float:1.8344659E38)
            android.view.View r0 = p064e.C1494h.m4055f(r9, r10)
            r6 = r0
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            if (r6 == 0) goto L62
            r10 = 2131362637(0x7f0a034d, float:1.834506E38)
            android.view.View r0 = p064e.C1494h.m4055f(r9, r10)
            r7 = r0
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            if (r7 == 0) goto L62
            jd.l r10 = new jd.l
            r2 = r9
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            cg.c r9 = new cg.c
            mh.l<cg.b, ch.l> r0 = r8.f4959f
            r9.<init>(r10, r0)
            return r9
        L62:
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r9 = r9.getResourceName(r10)
            java.lang.NullPointerException r10 = new java.lang.NullPointerException
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r9 = r0.concat(r9)
            r10.<init>(r9)
            throw r10
    }

    /* renamed from: j */
    public void m2677j(cg.C0961c r9, int r10, java.util.List<java.lang.Object> r11) {
            r8 = this;
            java.lang.String r0 = "holder"
            p214m2.C4339q.m9706k(r9, r0)
            java.lang.String r0 = "payloads"
            p214m2.C4339q.m9706k(r11, r0)
            androidx.recyclerview.widget.e<T> r0 = r8.f3640d
            java.util.List<T> r0 = r0.f3398f
            java.lang.Object r10 = r0.get(r10)
            cg.b r10 = (cg.C0960b) r10
            boolean r0 = r11.isEmpty()
            boolean r1 = r11.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L43
            java.util.Iterator r11 = r11.iterator()
        L24:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r11.next()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 == 0) goto L41
            java.lang.String r1 = "mediaItem"
            p214m2.C4339q.m9705j(r10, r1)
            r9.m2678x(r10)
            goto L24
        L41:
            r0 = 1
            goto L24
        L43:
            if (r0 == 0) goto L106
            r9.f4972y = r10
            android.widget.TextView r11 = r9.f4968u
            java.lang.String r0 = r10.f4962b
            r11.setText(r0)
            java.lang.Long r11 = r10.f4966f
            r0 = 0
            if (r11 == 0) goto Lc3
            long r3 = r11.longValue()
            r11 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r11
            long r3 = r3 / r5
            int r11 = (int) r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r3 = r11 / 3600
            java.lang.String r4 = ":"
            java.lang.String r5 = "format(format, *args)"
            java.lang.String r6 = "%02d"
            if (r3 < r2) goto L84
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7[r0] = r3
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r7, r2)
            java.lang.String r3 = java.lang.String.format(r6, r3)
            p214m2.C4339q.m9705j(r3, r5)
            r1.append(r3)
            r1.append(r4)
        L84:
            int r3 = r11 % 3600
            int r3 = r3 / 60
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r7[r0] = r3
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r7, r2)
            java.lang.String r3 = java.lang.String.format(r6, r3)
            p214m2.C4339q.m9705j(r3, r5)
            r1.append(r3)
            r1.append(r4)
            int r11 = r11 % 60
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r3[r0] = r11
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r3, r2)
            java.lang.String r11 = java.lang.String.format(r6, r11)
            p214m2.C4339q.m9705j(r11, r5)
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.lang.String r0 = "sb.toString()"
            p214m2.C4339q.m9705j(r11, r0)
            goto Lc4
        Lc3:
            r11 = 0
        Lc4:
            java.lang.String r0 = ""
            if (r11 != 0) goto Lc9
            r11 = r0
        Lc9:
            int r1 = r11.length()
            if (r1 <= 0) goto Ld0
            goto Ld1
        Ld0:
            r2 = 0
        Ld1:
            if (r2 == 0) goto Ld9
            java.lang.String r0 = " \u2022 "
            java.lang.String r0 = p064e.C1493g.m4049a(r0, r11)
        Ld9:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = r10.f4963c
            java.lang.String r11 = p346u.C6269n.m12888a(r11, r1, r0)
            android.widget.TextView r0 = r9.f4969v
            r0.setText(r11)
            r9.m2678x(r10)
            android.widget.ImageView r11 = r9.f4970w
            com.bumptech.glide.j r11 = com.bumptech.glide.ComponentCallbacks2C0999c.m2737f(r11)
            android.net.Uri r10 = r10.f4964d
            com.bumptech.glide.i r10 = r11.mo2770s(r10)
            r11 = 2131230907(0x7f0800bb, float:1.807788E38)
            c3.a r10 = r10.mo2546v(r11)
            com.bumptech.glide.i r10 = (com.bumptech.glide.C1005i) r10
            android.widget.ImageView r9 = r9.f4970w
            r10.m2753O(r9)
        L106:
            return
    }
}
