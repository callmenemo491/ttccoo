package p206le;

/* renamed from: le.g */
/* loaded from: classes.dex */
public final class C4276g extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<p086f2.InterfaceC1987b<? extends me.C4595c>, java.lang.Integer, android.view.View, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p206le.C4272c f17486Z;

    public C4276g(p206le.C4272c r1) {
            r0 = this;
            r0.f17486Z = r1
            r1 = 3
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(p086f2.InterfaceC1987b<? extends me.C4595c> r3, java.lang.Integer r4, android.view.View r5) {
            r2 = this;
            f2.b r3 = (p086f2.InterfaceC1987b) r3
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            android.view.View r5 = (android.view.View) r5
            java.lang.String r4 = "$this$onChildViewClick"
            p214m2.C4339q.m9706k(r3, r4)
            java.lang.String r4 = "<anonymous parameter 1>"
            p214m2.C4339q.m9706k(r5, r4)
            le.c r4 = r2.f17486Z
            androidx.fragment.app.d0 r4 = r4.m1337u()
            java.lang.String r5 = "childFragmentManager"
            p214m2.C4339q.m9705j(r4, r5)
            java.lang.Object r3 = r3.getItem()
            me.c r3 = (me.C4595c) r3
            java.lang.String r5 = "fragmentManager"
            p214m2.C4339q.m9706k(r4, r5)
            java.lang.String r5 = "poolDataWithMy"
            p214m2.C4339q.m9706k(r3, r5)
            ne.c r0 = new ne.c
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r1.putSerializable(r5, r3)
            r0.m1344x0(r1)
            r3 = 0
            r0.mo1229K0(r4, r3)
            ch.l r3 = ch.C0985l.f5061a
            return r3
    }
}
