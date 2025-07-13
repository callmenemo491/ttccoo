package je;

/* renamed from: je.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C3582d implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ int f15699a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f15700b;

    public /* synthetic */ C3582d(io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTMainFragment r2) {
            r1 = this;
            r0 = 1
            r1.f15699a = r0
            r1.<init>()
            r1.f15700b = r2
            return
    }

    public /* synthetic */ C3582d(je.C3583e r2) {
            r1 = this;
            r0 = 0
            r1.f15699a = r0
            r1.<init>()
            r1.f15700b = r2
            return
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(android.widget.TextView r6, int r7, android.view.KeyEvent r8) {
            r5 = this;
            int r8 = r5.f15699a
            r0 = 0
            r1 = 1
            r2 = 3
            java.lang.String r3 = "this$0"
            switch(r8) {
                case 0: goto Lb;
                default: goto La;
            }
        La:
            goto L1f
        Lb:
            java.lang.Object r8 = r5.f15700b
            je.e r8 = (je.C3583e) r8
            int r4 = je.C3583e.f15701o1
            p214m2.C4339q.m9706k(r8, r3)
            if (r7 != r2) goto L1e
            androidx.fragment.app.s r7 = r8.m1333s()
            vg.C6664e.m13505f(r7, r6)
            r0 = 1
        L1e:
            return r0
        L1f:
            java.lang.Object r8 = r5.f15700b
            io.tacocrypto.app.ui.tools.nftwallet.main.NFTMainFragment r8 = (io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTMainFragment) r8
            int r4 = io.tacocrypto.app.p156ui.tools.nftwallet.main.NFTMainFragment.f14489X0
            p214m2.C4339q.m9706k(r8, r3)
            if (r7 != r2) goto L32
            androidx.fragment.app.s r7 = r8.m1333s()
            vg.C6664e.m13505f(r7, r6)
            r0 = 1
        L32:
            return r0
    }
}
