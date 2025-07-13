package p171jd;

/* renamed from: jd.a */
/* loaded from: classes.dex */
public final class C3487a implements p383w1.InterfaceC6776a {

    /* renamed from: a */
    public final /* synthetic */ int f14989a;

    /* renamed from: b */
    public final androidx.constraintlayout.widget.ConstraintLayout f14990b;

    public C3487a(androidx.constraintlayout.widget.ConstraintLayout r2, int r3) {
            r1 = this;
            r1.f14989a = r3
            r0 = 1
            if (r3 == r0) goto L14
            r0 = 2
            if (r3 == r0) goto Le
            r1.<init>()
            r1.f14990b = r2
            return
        Le:
            r1.<init>()
            r1.f14990b = r2
            return
        L14:
            r1.<init>()
            r1.f14990b = r2
            return
    }

    /* renamed from: a */
    public androidx.constraintlayout.widget.ConstraintLayout m7965a() {
            r1 = this;
            int r0 = r1.f14989a
            switch(r0) {
                case 0: goto L9;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto Lc
        L6:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.f14990b
            return r0
        L9:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.f14990b
            return r0
        Lc:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.f14990b
            return r0
    }

    @Override // p383w1.InterfaceC6776a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ android.view.View mo1053b() {
            r1 = this;
            int r0 = r1.f14989a
            switch(r0) {
                case 0: goto Lb;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.m7965a()
            return r0
        Lb:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.m7965a()
            return r0
        L10:
            androidx.constraintlayout.widget.ConstraintLayout r0 = r1.m7965a()
            return r0
    }
}
