package wf;

/* renamed from: wf.g */
/* loaded from: classes.dex */
public final class C6860g extends android.widget.ArrayAdapter<wf.C6859f> {

    /* renamed from: wf.g$a */
    public static final class a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<p205ld.C4265b<android.graphics.drawable.Drawable>, p205ld.C4265b<android.graphics.drawable.Drawable>> {

        /* renamed from: Z */
        public static final wf.C6860g.a f26619Z = null;

        static {
                wf.g$a r0 = new wf.g$a
                r0.<init>()
                wf.C6860g.a.f26619Z = r0
                return
        }

        public a() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // mh.InterfaceC4620l
        /* renamed from: b */
        public p205ld.C4265b<android.graphics.drawable.Drawable> mo107b(p205ld.C4265b<android.graphics.drawable.Drawable> r2) {
                r1 = this;
                ld.b r2 = (p205ld.C4265b) r2
                java.lang.String r0 = "$this$loadCustom"
                p214m2.C4339q.m9706k(r2, r0)
                m2.k r0 = p214m2.AbstractC4333k.f17722c
                ld.b r2 = r2.m9573a0(r0)
                r0 = 2131230823(0x7f080067, float:1.807771E38)
                ld.b r2 = r2.m9574b0(r0)
                java.lang.String r0 = "diskCacheStrategy(DiskCa\u2026r(R.drawable.bg_row_oval)"
                p214m2.C4339q.m9705j(r2, r0)
                return r2
        }
    }

    public C6860g(android.content.Context r2, java.util.List<wf.C6859f> r3) {
            r1 = this;
            r0 = 2131558490(0x7f0d005a, float:1.8742297E38)
            r1.<init>(r2, r0, r3)
            return
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
            r3 = this;
            java.lang.String r0 = "parent"
            p214m2.C4339q.m9706k(r6, r0)
            if (r5 != 0) goto L1c
            android.content.Context r5 = r3.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            r0 = 2131558490(0x7f0d005a, float:1.8742297E38)
            r1 = 0
            android.view.View r5 = r5.inflate(r0, r6, r1)
            java.lang.String r6 = "from(context)\n          \u2026pup_image, parent, false)"
            p214m2.C4339q.m9705j(r5, r6)
        L1c:
            java.lang.Object r4 = r3.getItem(r4)
            wf.f r4 = (wf.C6859f) r4
            jd.h r5 = p171jd.C3515h.m7985c(r5)
            java.lang.Object r6 = r5.f15196d
            androidx.appcompat.widget.AppCompatTextView r6 = (androidx.appcompat.widget.AppCompatTextView) r6
            if (r4 == 0) goto L31
            java.lang.String r0 = r4.f26614a
            if (r0 == 0) goto L31
            goto L33
        L31:
            java.lang.String r0 = "--"
        L33:
            r6.setText(r0)
            r6 = 0
            if (r4 == 0) goto La3
            java.lang.Object r0 = r5.f15196d
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.f26614a
            r1.append(r2)
            java.lang.String r2 = " ("
            r1.append(r2)
            int r2 = r4.f26615b
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.setText(r1)
            java.lang.String r0 = r4.f26616c
            if (r0 == 0) goto L78
            java.lang.Object r0 = r5.f15195c
            com.google.android.material.imageview.ShapeableImageView r0 = (com.google.android.material.imageview.ShapeableImageView) r0
            java.lang.String r1 = "binding.imageView"
            p214m2.C4339q.m9705j(r0, r1)
            java.lang.String r4 = r4.f26616c
            r1 = 24
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            wf.g$a r2 = wf.C6860g.a.f26619Z
            vg.C6672m.m13522i(r0, r4, r6, r1, r2)
            goto Lb3
        L78:
            java.lang.Integer r4 = r4.f26617d
            if (r4 == 0) goto Lac
            android.content.Context r4 = r3.getContext()
            r6 = 2131231078(0x7f080166, float:1.8078227E38)
            java.lang.Object r0 = p046d0.C1259a.f6733a
            android.graphics.drawable.Drawable r4 = p046d0.C1259a.b.m3710b(r4, r6)
            java.lang.Object r6 = r5.f15195c
            com.google.android.material.imageview.ShapeableImageView r6 = (com.google.android.material.imageview.ShapeableImageView) r6
            ld.c r6 = p185k7.C3836i.m8631p(r6)
            com.bumptech.glide.i r6 = r6.mo2766o()
            com.bumptech.glide.i r4 = r6.mo2755R(r4)
            ld.b r4 = (p205ld.C4265b) r4
            java.lang.Object r6 = r5.f15195c
            com.google.android.material.imageview.ShapeableImageView r6 = (com.google.android.material.imageview.ShapeableImageView) r6
            r4.m2753O(r6)
            goto Lb3
        La3:
            java.lang.Object r4 = r5.f15196d
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            java.lang.String r0 = "---"
            r4.setText(r0)
        Lac:
            java.lang.Object r4 = r5.f15195c
            com.google.android.material.imageview.ShapeableImageView r4 = (com.google.android.material.imageview.ShapeableImageView) r4
            r4.setImageDrawable(r6)
        Lb3:
            androidx.appcompat.widget.LinearLayoutCompat r4 = r5.m7987e()
            java.lang.String r5 = "binding.root"
            p214m2.C4339q.m9705j(r4, r5)
            return r4
    }
}
