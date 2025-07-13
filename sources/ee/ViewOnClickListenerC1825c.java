package ee;

/* renamed from: ee.c */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1825c implements android.view.View.OnClickListener {

    /* renamed from: Y */
    public final /* synthetic */ int f7950Y;

    /* renamed from: Z */
    public final /* synthetic */ java.lang.Object f7951Z;

    /* renamed from: a0 */
    public final /* synthetic */ int f7952a0;

    public /* synthetic */ ViewOnClickListenerC1825c(int r2, mh.InterfaceC4620l r3) {
            r1 = this;
            r0 = 1
            r1.f7950Y = r0
            r1.<init>()
            r1.f7952a0 = r2
            r1.f7951Z = r3
            return
    }

    public /* synthetic */ ViewOnClickListenerC1825c(ee.C1827e r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f7950Y = r0
            r1.<init>()
            r1.f7951Z = r2
            r1.f7952a0 = r3
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r7) {
            r6 = this;
            int r0 = r6.f7950Y
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L32
        L6:
            java.lang.Object r7 = r6.f7951Z
            ee.e r7 = (ee.C1827e) r7
            int r0 = r6.f7952a0
            java.lang.String r1 = "this$0"
            p214m2.C4339q.m9706k(r7, r1)
            java.util.List<io.tacocrypto.app.ui.secret.c> r1 = r7.f7957f
            java.lang.Object r0 = r1.get(r0)
            io.tacocrypto.app.ui.secret.c r0 = (io.tacocrypto.app.p156ui.secret.EnumC3251c) r0
            java.util.Set<io.tacocrypto.app.ui.secret.c> r1 = r7.f7956e
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L27
            java.util.Set<io.tacocrypto.app.ui.secret.c> r1 = r7.f7956e
            r1.remove(r0)
            goto L2c
        L27:
            java.util.Set<io.tacocrypto.app.ui.secret.c> r1 = r7.f7956e
            r1.add(r0)
        L2c:
            androidx.recyclerview.widget.RecyclerView$f r7 = r7.f3228a
            r7.m1813b()
            return
        L32:
            int r0 = r6.f7952a0
            java.lang.Object r1 = r6.f7951Z
            mh.l r1 = (mh.InterfaceC4620l) r1
            java.lang.String r2 = "$callback"
            p214m2.C4339q.m9706k(r1, r2)
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = vg.C6664e.f25908a
            long r2 = r2 - r4
            long r4 = (long) r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L4a
            goto L58
        L4a:
            long r2 = android.os.SystemClock.elapsedRealtime()
            vg.C6664e.f25908a = r2
            java.lang.String r0 = "it"
            p214m2.C4339q.m9705j(r7, r0)
            r1.mo107b(r7)
        L58:
            return
    }
}
