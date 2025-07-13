package p360ue;

/* renamed from: ue.g0 */
/* loaded from: classes.dex */
public final class C6412g0 extends androidx.recyclerview.widget.RecyclerView.AbstractC0549e<androidx.recyclerview.widget.RecyclerView.AbstractC0546b0> {

    /* renamed from: d */
    public final p020b3.C0660b f24954d;

    /* renamed from: e */
    public final mh.InterfaceC4620l<p360ue.C6404c0, ch.C0985l> f24955e;

    /* renamed from: f */
    public final mh.InterfaceC4620l<p360ue.C6404c0, ch.C0985l> f24956f;

    /* renamed from: g */
    public java.util.List<? extends java.lang.Object> f24957g;

    /* renamed from: ue.g0$a */
    public final class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final p171jd.C3504e0 f24958u;

        /* renamed from: v */
        public android.os.CountDownTimer f24959v;

        /* renamed from: w */
        public final /* synthetic */ p360ue.C6412g0 f24960w;

        public a(p360ue.C6412g0 r1, p171jd.C3504e0 r2) {
                r0 = this;
                r0.f24960w = r1
                com.google.android.material.card.MaterialCardView r1 = r2.m7978a()
                r0.<init>(r1)
                r0.f24958u = r2
                return
        }
    }

    /* renamed from: ue.g0$b */
    public static final class b extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final p171jd.C3520i0 f24961u;

        public b(p171jd.C3520i0 r2) {
                r1 = this;
                androidx.appcompat.widget.AppCompatTextView r0 = r2.m7990a()
                r1.<init>(r0)
                r1.f24961u = r2
                return
        }
    }

    public C6412g0(p020b3.C0660b r1, mh.InterfaceC4620l<? super p360ue.C6404c0, ch.C0985l> r2, mh.InterfaceC4620l<? super p360ue.C6404c0, ch.C0985l> r3) {
            r0 = this;
            r0.<init>()
            r0.f24954d = r1
            r0.f24955e = r2
            r0.f24956f = r3
            dh.k r1 = p062dh.C1475k.f7237Y
            r0.f24957g = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: b */
    public int mo1521b() {
            r1 = this;
            java.util.List<? extends java.lang.Object> r0 = r1.f24957g
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto La
            r0 = 0
            goto L12
        La:
            java.util.List<? extends java.lang.Object> r0 = r1.f24957g
            int r0 = r0.size()
            int r0 = r0 + 1
        L12:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: d */
    public int mo1522d(int r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            goto L5
        L4:
            r1 = 1
        L5:
            return r1
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: e */
    public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r16, int r17) {
            r15 = this;
            r0 = r16
            java.lang.String r1 = "holder"
            p214m2.C4339q.m9706k(r0, r1)
            boolean r1 = r0 instanceof p360ue.C6412g0.b
            java.lang.String r2 = "item"
            if (r1 == 0) goto L1d
            ue.g0$b r0 = (p360ue.C6412g0.b) r0
            java.lang.String r1 = "Brawlers"
            p214m2.C4339q.m9706k(r1, r2)
            jd.i0 r0 = r0.f24961u
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f15229c
            r0.setText(r1)
            goto L12e
        L1d:
            boolean r1 = r0 instanceof p360ue.C6412g0.a
            if (r1 == 0) goto L12e
            ue.g0$a r0 = (p360ue.C6412g0.a) r0
            r1 = r15
            java.util.List<? extends java.lang.Object> r3 = r1.f24957g
            r4 = 1
            int r5 = r17 + (-1)
            java.lang.Object r3 = r3.get(r5)
            ue.c0 r3 = (p360ue.C6404c0) r3
            p214m2.C4339q.m9706k(r3, r2)
            jd.e0 r2 = r0.f24958u
            ue.g0 r5 = r0.f24960w
            java.lang.Object r6 = r2.f15109e
            r7 = r6
            com.google.android.material.imageview.ShapeableImageView r7 = (com.google.android.material.imageview.ShapeableImageView) r7
            java.lang.String r6 = "imageView"
            p214m2.C4339q.m9705j(r7, r6)
            java.lang.String r8 = r3.f24940b0
            r9 = 0
            r6 = 48
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r11 = 0
            r12 = 8
            vg.C6672m.m13523j(r7, r8, r9, r10, r11, r12)
            java.lang.Object r6 = r2.f15112h
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            java.lang.String r7 = r3.f24939a0
            r6.setText(r7)
            androidx.appcompat.widget.AppCompatTextView r6 = r2.f15107c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            int r8 = r3.f24943e0
            r7.append(r8)
            r8 = 47
            r7.append(r8)
            int r8 = r3.f24944f0
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.setText(r7)
            androidx.appcompat.widget.AppCompatTextView r6 = r2.f15110f
            java.lang.String r7 = r3.f24941c0
            r6.setText(r7)
            com.google.android.material.button.MaterialButton r6 = r2.f15108d
            r7 = 0
            r6.setEnabled(r7)
            com.google.android.material.button.MaterialButton r6 = r2.f15108d
            java.lang.String r8 = "brawlButton"
            p214m2.C4339q.m9705j(r6, r8)
            ue.d0 r8 = new ue.d0
            r8.<init>(r5, r3)
            vg.C6664e.m13509j(r6, r7, r8, r4)
            int r6 = r3.f24943e0
            int r8 = r3.f24944f0
            if (r6 >= r8) goto L99
            r6 = 1
            goto L9a
        L99:
            r6 = 0
        L9a:
            java.lang.Object r8 = r2.f15111g
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            r8.setEnabled(r6)
            java.lang.Object r8 = r2.f15111g
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            r9 = 1058642330(0x3f19999a, float:0.6)
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto Laf
            r6 = 1065353216(0x3f800000, float:1.0)
            goto Lb2
        Laf:
            r6 = 1058642330(0x3f19999a, float:0.6)
        Lb2:
            r8.setAlpha(r6)
            java.lang.Object r6 = r2.f15111g
            com.google.android.material.button.MaterialButton r6 = (com.google.android.material.button.MaterialButton) r6
            java.lang.String r8 = "healButton"
            p214m2.C4339q.m9705j(r6, r8)
            ue.e0 r8 = new ue.e0
            r8.<init>(r5, r3)
            vg.C6664e.m13509j(r6, r7, r8, r4)
            android.os.CountDownTimer r6 = r0.f24959v
            if (r6 == 0) goto Lcd
            r6.cancel()
        Lcd:
            b3.b r6 = r5.f24954d
            android.os.CountDownTimer r8 = r0.f24959v
            java.util.Objects.requireNonNull(r6)
            if (r8 == 0) goto Lde
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r6 = r6.f3814a
            r6.remove(r8)
            r8.cancel()
        Lde:
            java.lang.String r6 = "UTC"
            java.util.TimeZone r6 = java.util.TimeZone.getTimeZone(r6)
            java.util.Calendar r6 = java.util.Calendar.getInstance(r6)
            long r11 = r6.getTimeInMillis()
            long r13 = r3.f24946h0
            r3 = 1000(0x3e8, float:1.401E-42)
            r6 = r5
            long r4 = (long) r3
            long r13 = r13 * r4
            long r13 = r13 - r11
            r3 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r5 = "BRAWL"
            int r8 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r8 <= 0) goto L11d
            com.google.android.material.button.MaterialButton r3 = r2.f15108d
            r3.setEnabled(r7)
            com.google.android.material.button.MaterialButton r3 = r2.f15108d
            r3.setAlpha(r9)
            ue.f0 r3 = new ue.f0
            r3.<init>(r13, r2, r5)
            android.os.CountDownTimer r2 = r3.start()
            b3.b r3 = r6.f24954d
            java.lang.String r4 = "it"
            p214m2.C4339q.m9705j(r2, r4)
            r3.m2206a(r2)
            r0.f24959v = r2
            goto L12f
        L11d:
            com.google.android.material.button.MaterialButton r0 = r2.f15108d
            r0.setText(r5)
            com.google.android.material.button.MaterialButton r0 = r2.f15108d
            r3 = 1
            r0.setEnabled(r3)
            com.google.android.material.button.MaterialButton r0 = r2.f15108d
            r0.setAlpha(r10)
            goto L12f
        L12e:
            r1 = r15
        L12f:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: g */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 mo1524g(android.view.ViewGroup r10, int r11) {
            r9 = this;
            java.lang.String r0 = "parent"
            p214m2.C4339q.m9706k(r10, r0)
            android.content.Context r0 = r10.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1 = 0
            if (r11 == 0) goto L8d
            r2 = 1
            if (r11 != r2) goto L85
            r11 = 2131558623(0x7f0d00df, float:1.8742567E38)
            android.view.View r10 = r0.inflate(r11, r10, r1)
            r11 = 2131361933(0x7f0a008d, float:1.8343632E38)
            android.view.View r0 = p064e.C1494h.m4055f(r10, r11)
            r3 = r0
            com.google.android.material.button.MaterialButton r3 = (com.google.android.material.button.MaterialButton) r3
            if (r3 == 0) goto L71
            r11 = 2131362227(0x7f0a01b3, float:1.8344229E38)
            android.view.View r0 = p064e.C1494h.m4055f(r10, r11)
            r4 = r0
            com.google.android.material.button.MaterialButton r4 = (com.google.android.material.button.MaterialButton) r4
            if (r4 == 0) goto L71
            r11 = 2131362228(0x7f0a01b4, float:1.834423E38)
            android.view.View r0 = p064e.C1494h.m4055f(r10, r11)
            r5 = r0
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r5 == 0) goto L71
            r11 = 2131362262(0x7f0a01d6, float:1.83443E38)
            android.view.View r0 = p064e.C1494h.m4055f(r10, r11)
            r6 = r0
            com.google.android.material.imageview.ShapeableImageView r6 = (com.google.android.material.imageview.ShapeableImageView) r6
            if (r6 == 0) goto L71
            r11 = 2131362517(0x7f0a02d5, float:1.8344817E38)
            android.view.View r0 = p064e.C1494h.m4055f(r10, r11)
            r7 = r0
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            if (r7 == 0) goto L71
            r11 = 2131362710(0x7f0a0396, float:1.8345208E38)
            android.view.View r0 = p064e.C1494h.m4055f(r10, r11)
            r8 = r0
            androidx.appcompat.widget.AppCompatTextView r8 = (androidx.appcompat.widget.AppCompatTextView) r8
            if (r8 == 0) goto L71
            jd.e0 r11 = new jd.e0
            r2 = r10
            com.google.android.material.card.MaterialCardView r2 = (com.google.android.material.card.MaterialCardView) r2
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            ue.g0$a r10 = new ue.g0$a
            r10.<init>(r9, r11)
            goto L97
        L71:
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r10 = r10.getResourceName(r11)
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r0 = "Missing required view with ID: "
            java.lang.String r10 = r0.concat(r10)
            r11.<init>(r10)
            throw r11
        L85:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Item adapter UNKNOWN"
            r10.<init>(r11)
            throw r10
        L8d:
            jd.i0 r10 = p171jd.C3520i0.m7989c(r0, r10, r1)
            ue.g0$b r11 = new ue.g0$b
            r11.<init>(r10)
            r10 = r11
        L97:
            return r10
    }
}
