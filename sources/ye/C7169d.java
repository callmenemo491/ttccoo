package ye;

/* renamed from: ye.d */
/* loaded from: classes.dex */
public final class C7169d extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<ye.C7165b.b, java.lang.Integer, java.lang.String, ch.C0985l> {

    /* renamed from: Z */
    public static final ye.C7169d f27661Z = null;

    static {
            ye.d r0 = new ye.d
            r0.<init>()
            ye.C7169d.f27661Z = r0
            return
    }

    public C7169d() {
            r1 = this;
            r0 = 3
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(ye.C7165b.b r1, java.lang.Integer r2, java.lang.String r3) {
            r0 = this;
            ye.b$b r1 = (ye.C7165b.b) r1
            java.lang.Number r2 = (java.lang.Number) r2
            r2.intValue()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r2 = "$this$onBind"
            p214m2.C4339q.m9706k(r1, r2)
            java.lang.String r2 = "item"
            p214m2.C4339q.m9706k(r3, r2)
            p214m2.C4339q.m9706k(r3, r2)
            android.view.View r1 = r1.f3208a
            java.lang.String r2 = "rootView"
            java.util.Objects.requireNonNull(r1, r2)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            r1.setText(r3)
            ch.l r1 = ch.C0985l.f5061a
            return r1
    }
}
