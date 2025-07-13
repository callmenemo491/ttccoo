package p315rg;

/* renamed from: rg.b */
/* loaded from: classes.dex */
public final class C5846b extends android.widget.ArrayAdapter<p255od.C5194b0> {
    public C5846b(android.content.Context r2, java.util.List<p255od.C5194b0> r3) {
            r1 = this;
            r0 = 2131558490(0x7f0d005a, float:1.8742297E38)
            r1.<init>(r2, r0, r3)
            return
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            java.lang.String r0 = "parent"
            p214m2.C4339q.m9706k(r5, r0)
            if (r4 != 0) goto L1c
            android.content.Context r4 = r2.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r0 = 2131558490(0x7f0d005a, float:1.8742297E38)
            r1 = 0
            android.view.View r4 = r4.inflate(r0, r5, r1)
            java.lang.String r5 = "from(context)\n          \u2026pup_image, parent, false)"
            p214m2.C4339q.m9705j(r4, r5)
        L1c:
            java.lang.Object r3 = r2.getItem(r3)
            od.b0 r3 = (p255od.C5194b0) r3
            jd.h r4 = p171jd.C3515h.m7985c(r4)
            java.lang.Object r5 = r4.f15196d
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            if (r3 == 0) goto L33
            java.lang.String r0 = r3.getCurrency()
            if (r0 == 0) goto L33
            goto L35
        L33:
            java.lang.String r0 = "--"
        L35:
            r5.setText(r0)
            if (r3 == 0) goto L6c
            java.lang.Object r5 = r4.f15196d
            androidx.appcompat.widget.AppCompatTextView r5 = (androidx.appcompat.widget.AppCompatTextView) r5
            java.lang.String r0 = r3.getCurrency()
            r5.setText(r0)
            java.lang.Object r5 = r4.f15195c
            com.google.android.material.imageview.ShapeableImageView r5 = (com.google.android.material.imageview.ShapeableImageView) r5
            com.bumptech.glide.j r5 = com.bumptech.glide.ComponentCallbacks2C0999c.m2737f(r5)
            java.lang.String r3 = r3.getImage()
            com.bumptech.glide.i r3 = r5.mo2771t(r3)
            r5 = 2131231350(0x7f080276, float:1.8078779E38)
            c3.a r3 = r3.mo2546v(r5)
            com.bumptech.glide.i r3 = (com.bumptech.glide.C1005i) r3
            c3.a r3 = r3.mo2536g(r5)
            com.bumptech.glide.i r3 = (com.bumptech.glide.C1005i) r3
            java.lang.Object r5 = r4.f15195c
            com.google.android.material.imageview.ShapeableImageView r5 = (com.google.android.material.imageview.ShapeableImageView) r5
            r3.m2753O(r5)
            goto L7d
        L6c:
            java.lang.Object r3 = r4.f15196d
            androidx.appcompat.widget.AppCompatTextView r3 = (androidx.appcompat.widget.AppCompatTextView) r3
            java.lang.String r5 = "---"
            r3.setText(r5)
            java.lang.Object r3 = r4.f15195c
            com.google.android.material.imageview.ShapeableImageView r3 = (com.google.android.material.imageview.ShapeableImageView) r3
            r5 = 0
            r3.setImageDrawable(r5)
        L7d:
            androidx.appcompat.widget.LinearLayoutCompat r3 = r4.m7987e()
            java.lang.String r4 = "binding.root"
            p214m2.C4339q.m9705j(r3, r4)
            return r3
    }
}
