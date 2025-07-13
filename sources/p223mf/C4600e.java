package p223mf;

/* renamed from: mf.e */
/* loaded from: classes.dex */
public final class C4600e extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<p223mf.C4598c.a, java.lang.Integer, p223mf.C4601f.a, ch.C0985l> {

    /* renamed from: Z */
    public static final p223mf.C4600e f18455Z = null;

    static {
            mf.e r0 = new mf.e
            r0.<init>()
            p223mf.C4600e.f18455Z = r0
            return
    }

    public C4600e() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(p223mf.C4598c.a r6, java.lang.Integer r7, p223mf.C4601f.a r8) {
            r5 = this;
            mf.c$a r6 = (p223mf.C4598c.a) r6
            java.lang.Number r7 = (java.lang.Number) r7
            r7.intValue()
            mf.f$a r8 = (p223mf.C4601f.a) r8
            java.lang.String r7 = "$this$onBind"
            p214m2.C4339q.m9706k(r6, r7)
            java.lang.String r7 = "item"
            p214m2.C4339q.m9706k(r8, r7)
            p214m2.C4339q.m9706k(r8, r7)
            jd.d0 r6 = r6.f18446u
            java.lang.Object r7 = r6.f15082d
            androidx.appcompat.widget.AppCompatTextView r7 = (androidx.appcompat.widget.AppCompatTextView) r7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r8.f18469c
            r0.append(r1)
            r1 = 32
            r0.append(r1)
            java.lang.String r1 = r8.f18468b
            if (r1 != 0) goto L31
            java.lang.String r1 = r8.f18467a
        L31:
            p238nd.C4788z.m10841a(r0, r1, r7)
            androidx.appcompat.widget.AppCompatTextView r7 = r6.f15083e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Double r1 = r8.f18470d
            if (r1 == 0) goto L4a
            double r1 = r1.doubleValue()
            r3 = 0
            r4 = 2
            java.lang.String r1 = vg.C6672m.m13535v(r1, r4, r3, r4)
            goto L4c
        L4a:
            java.lang.String r1 = "--"
        L4c:
            r0.append(r1)
            java.lang.String r1 = " SEST"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.setText(r0)
            java.lang.Object r6 = r6.f15081c
            com.google.android.material.imageview.ShapeableImageView r6 = (com.google.android.material.imageview.ShapeableImageView) r6
            java.lang.String r7 = "imageView"
            p214m2.C4339q.m9705j(r6, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "https://assets.tacostudios.io/farmingtales/products/"
            r7.append(r0)
            java.lang.String r8 = r8.f18467a
            r7.append(r8)
            java.lang.String r8 = ".png"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            vg.C6672m.m13521h(r6, r7)
            ch.l r6 = ch.C0985l.f5061a
            return r6
    }
}
