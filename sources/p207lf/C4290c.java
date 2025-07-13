package p207lf;

/* renamed from: lf.c */
/* loaded from: classes.dex */
public final class C4290c extends androidx.recyclerview.widget.RecyclerView.AbstractC0549e<p207lf.C4290c.a> {

    /* renamed from: d */
    public final mh.InterfaceC4620l<p192kf.C4118o, ch.C0985l> f17520d;

    /* renamed from: e */
    public java.util.List<p192kf.C4118o> f17521e;

    /* renamed from: lf.c$a */
    public static final class a extends androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 {

        /* renamed from: u */
        public final p171jd.C3570x f17522u;

        public a(p171jd.C3570x r2) {
                r1 = this;
                com.google.android.material.card.MaterialCardView r0 = r2.m8013c()
                r1.<init>(r0)
                r1.f17522u = r2
                return
        }
    }

    public C4290c(mh.InterfaceC4620l<? super p192kf.C4118o, ch.C0985l> r1) {
            r0 = this;
            r0.<init>()
            r0.f17520d = r1
            dh.k r1 = p062dh.C1475k.f7237Y
            r0.f17521e = r1
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: b */
    public int mo1521b() {
            r1 = this;
            java.util.List<kf.o> r0 = r1.f17521e
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: e */
    public void mo1523e(androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r5, int r6) {
            r4 = this;
            lf.c$a r5 = (p207lf.C4290c.a) r5
            java.lang.String r0 = "holder"
            p214m2.C4339q.m9706k(r5, r0)
            java.util.List<kf.o> r0 = r4.f17521e
            java.lang.Object r6 = r0.get(r6)
            kf.o r6 = (p192kf.C4118o) r6
            mh.l<kf.o, ch.l> r0 = r4.f17520d
            java.lang.String r1 = "item"
            p214m2.C4339q.m9706k(r6, r1)
            java.lang.String r1 = "onClick"
            p214m2.C4339q.m9706k(r0, r1)
            jd.x r5 = r5.f17522u
            java.lang.Object r1 = r5.f15628c
            com.google.android.material.imageview.ShapeableImageView r1 = (com.google.android.material.imageview.ShapeableImageView) r1
            java.lang.String r2 = "imageView"
            p214m2.C4339q.m9705j(r1, r2)
            java.lang.String r2 = r6.f17115d
            vg.C6672m.m13524k(r1, r2)
            java.lang.Object r1 = r5.f15629d
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            java.lang.String r2 = r6.f17114c
            r1.setText(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.f17116e
            r1.append(r2)
            java.lang.String r2 = " | "
            r1.append(r2)
            int r2 = r6.f17117f
            java.lang.String r3 = " SEST"
            java.lang.String r1 = p381w.C6764e.m13690a(r1, r2, r3)
            androidx.appcompat.widget.AppCompatTextView r2 = r5.f15631f
            r2.setText(r1)
            androidx.appcompat.widget.AppCompatTextView r1 = r5.f15631f
            java.lang.String r2 = "subtitleText"
            p214m2.C4339q.m9705j(r1, r2)
            r2 = 0
            r1.setVisibility(r2)
            java.lang.Object r5 = r5.f15630e
            com.google.android.material.button.MaterialButton r5 = (com.google.android.material.button.MaterialButton) r5
            java.lang.String r1 = "buttonStake"
            p214m2.C4339q.m9705j(r5, r1)
            lf.b r1 = new lf.b
            r1.<init>(r0, r6)
            r6 = 1
            vg.C6664e.m13509j(r5, r2, r1, r6)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0549e
    /* renamed from: g */
    public androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 mo1524g(android.view.ViewGroup r2, int r3) {
            r1 = this;
            java.lang.String r3 = "parent"
            p214m2.C4339q.m9706k(r2, r3)
            android.content.Context r3 = r2.getContext()
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r0 = 0
            jd.x r2 = p171jd.C3570x.m8012d(r3, r2, r0)
            lf.c$a r3 = new lf.c$a
            r3.<init>(r2)
            return r3
    }
}
