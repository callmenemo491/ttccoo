package p067e2;

/* renamed from: e2.a */
/* loaded from: classes.dex */
public final class C1508a extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<android.view.View, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p003a2.InterfaceC0004a f7340Z;

    /* renamed from: a0 */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 f7341a0;

    /* renamed from: b0 */
    public final /* synthetic */ mh.InterfaceC4625q f7342b0;

    public C1508a(p003a2.InterfaceC0004a r1, androidx.recyclerview.widget.RecyclerView.AbstractC0546b0 r2, mh.InterfaceC4625q r3) {
            r0 = this;
            r0.f7340Z = r1
            r0.f7341a0 = r2
            r0.f7342b0 = r3
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public ch.C0985l mo107b(android.view.View r4) {
            r3 = this;
            android.view.View r4 = (android.view.View) r4
            java.lang.String r0 = "child"
            p214m2.C4339q.m9707l(r4, r0)
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r3.f7341a0
            android.view.View r0 = r0.f3208a
            java.lang.String r1 = "viewHolder.itemView"
            p214m2.C4339q.m9703h(r0, r1)
            androidx.recyclerview.widget.RecyclerView$b0 r0 = p067e2.C1509b.m4098c(r0)
            int r0 = r0.m1789f()
            a2.a r1 = r3.f7340Z
            f2.b r1 = p067e2.C1509b.m4096a(r1, r0)
            mh.q r2 = r3.f7342b0     // Catch: java.lang.Throwable -> L2e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2e
            r2.mo115i(r1, r0, r4)     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            p101fh.C2174f.m5717g(r1, r4)
            ch.l r4 = ch.C0985l.f5061a
            return r4
        L2e:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L30
        L30:
            r0 = move-exception
            p101fh.C2174f.m5717g(r1, r4)
            throw r0
    }
}
