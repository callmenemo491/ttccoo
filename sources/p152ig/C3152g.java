package p152ig;

/* renamed from: ig.g */
/* loaded from: classes.dex */
public final class C3152g extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<p152ig.C3146c.a, java.lang.Integer, p173jg.C3609a, ch.C0985l> {

    /* renamed from: Z */
    public static final p152ig.C3152g f12606Z = null;

    static {
            ig.g r0 = new ig.g
            r0.<init>()
            p152ig.C3152g.f12606Z = r0
            return
    }

    public C3152g() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(p152ig.C3146c.a r8, java.lang.Integer r9, p173jg.C3609a r10) {
            r7 = this;
            ig.c$a r8 = (p152ig.C3146c.a) r8
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            jg.a r10 = (p173jg.C3609a) r10
            java.lang.String r9 = "$this$onBind"
            p214m2.C4339q.m9706k(r8, r9)
            java.lang.String r9 = "item"
            p214m2.C4339q.m9706k(r10, r9)
            p214m2.C4339q.m9706k(r10, r9)
            android.view.View r8 = r8.f3208a
            jd.m0 r8 = p171jd.C3536m0.m8003a(r8)
            r9 = 43
            java.lang.StringBuilder r9 = p367v1.C6487a.m13176a(r9)
            ig.c$b r0 = p152ig.C3146c.f12587q1
            double r1 = r10.f15872b
            java.lang.String r0 = p152ig.C3146c.b.m7600a(r0, r1)
            r9.append(r0)
            r0 = 37
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            androidx.appcompat.widget.AppCompatTextView r0 = r8.f15338f
            r0.setText(r9)
            androidx.appcompat.widget.AppCompatImageView r9 = r8.f15339g
            java.lang.String r0 = "shingIcon"
            p214m2.C4339q.m9705j(r9, r0)
            r0 = 8
            r9.setVisibility(r0)
            androidx.appcompat.widget.AppCompatTextView r9 = r8.f15335c
            java.lang.String r1 = "hText"
            p214m2.C4339q.m9705j(r9, r1)
            r9.setVisibility(r0)
            androidx.appcompat.widget.AppCompatTextView r9 = r8.f15337e
            java.lang.String r0 = r10.f15871a
            r9.setText(r0)
            androidx.appcompat.widget.AppCompatImageView r1 = r8.f15336d
            java.lang.String r9 = "imageView"
            p214m2.C4339q.m9705j(r1, r9)
            java.lang.String r2 = r10.m8037a()
            r3 = 0
            r9 = 248(0xf8, float:3.48E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)
            r5 = 0
            r6 = 8
            vg.C6672m.m13523j(r1, r2, r3, r4, r5, r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            int r10 = r10.f15874d
            java.lang.String r0 = " assets"
            java.lang.String r9 = p381w.C6764e.m13690a(r9, r10, r0)
            androidx.appcompat.widget.AppCompatTextView r8 = r8.f15334b
            r8.setText(r9)
            ch.l r8 = ch.C0985l.f5061a
            return r8
    }
}
