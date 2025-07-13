package p171jd;

/* renamed from: jd.i0 */
/* loaded from: classes.dex */
public final class C3520i0 implements p383w1.InterfaceC6776a {

    /* renamed from: a */
    public final /* synthetic */ int f15227a;

    /* renamed from: b */
    public final androidx.appcompat.widget.AppCompatTextView f15228b;

    /* renamed from: c */
    public final androidx.appcompat.widget.AppCompatTextView f15229c;

    public C3520i0(androidx.appcompat.widget.AppCompatTextView r2, androidx.appcompat.widget.AppCompatTextView r3, int r4) {
            r1 = this;
            r1.f15227a = r4
            r0 = 1
            if (r4 == r0) goto Ld
            r1.<init>()
            r1.f15228b = r2
            r1.f15229c = r3
            return
        Ld:
            r1.<init>()
            r1.f15228b = r2
            r1.f15229c = r3
            return
    }

    /* renamed from: c */
    public static p171jd.C3520i0 m7989c(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            r0 = 2131558603(0x7f0d00cb, float:1.8742526E38)
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Ld
            r3.addView(r2)
        Ld:
            java.lang.String r3 = "rootView"
            java.util.Objects.requireNonNull(r2, r3)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            jd.i0 r3 = new jd.i0
            r3.<init>(r2, r2, r1)
            return r3
    }

    /* renamed from: a */
    public androidx.appcompat.widget.AppCompatTextView m7990a() {
            r1 = this;
            int r0 = r1.f15227a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L9
        L6:
            androidx.appcompat.widget.AppCompatTextView r0 = r1.f15228b
            return r0
        L9:
            androidx.appcompat.widget.AppCompatTextView r0 = r1.f15228b
            return r0
    }

    @Override // p383w1.InterfaceC6776a
    /* renamed from: b */
    public /* bridge */ /* synthetic */ android.view.View mo1053b() {
            r1 = this;
            int r0 = r1.f15227a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lb
        L6:
            androidx.appcompat.widget.AppCompatTextView r0 = r1.m7990a()
            return r0
        Lb:
            androidx.appcompat.widget.AppCompatTextView r0 = r1.m7990a()
            return r0
    }
}
