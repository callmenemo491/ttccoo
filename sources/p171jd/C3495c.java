package p171jd;

/* renamed from: jd.c */
/* loaded from: classes.dex */
public final class C3495c implements p383w1.InterfaceC6776a {

    /* renamed from: a */
    public final /* synthetic */ int f15041a;

    /* renamed from: b */
    public final java.lang.Object f15042b;

    public C3495c(android.view.View r2) {
            r1 = this;
            r0 = 2
            r1.f15041a = r0
            r1.<init>()
            r1.f15042b = r2
            return
    }

    public C3495c(androidx.cardview.widget.CardView r2, int r3) {
            r1 = this;
            r1.f15041a = r3
            r0 = 1
            if (r3 == r0) goto Lb
            r1.<init>()
            r1.f15042b = r2
            return
        Lb:
            r1.<init>()
            r1.f15042b = r2
            return
    }

    /* renamed from: a */
    public static p171jd.C3495c m7968a(android.view.View r1) {
            java.lang.String r0 = "rootView"
            java.util.Objects.requireNonNull(r1, r0)
            jd.c r0 = new jd.c
            r0.<init>(r1)
            return r0
    }

    @Override // p383w1.InterfaceC6776a
    /* renamed from: b */
    public android.view.View mo1053b() {
            r1 = this;
            int r0 = r1.f15041a
            switch(r0) {
                case 0: goto Lb;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            androidx.cardview.widget.CardView r0 = r1.m7969c()
            return r0
        Lb:
            androidx.cardview.widget.CardView r0 = r1.m7969c()
            return r0
        L10:
            java.lang.Object r0 = r1.f15042b
            android.view.View r0 = (android.view.View) r0
            return r0
    }

    /* renamed from: c */
    public androidx.cardview.widget.CardView m7969c() {
            r1 = this;
            int r0 = r1.f15041a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lb
        L6:
            java.lang.Object r0 = r1.f15042b
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            return r0
        Lb:
            java.lang.Object r0 = r1.f15042b
            androidx.cardview.widget.CardView r0 = (androidx.cardview.widget.CardView) r0
            return r0
    }
}
