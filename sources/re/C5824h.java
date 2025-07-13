package re;

/* renamed from: re.h */
/* loaded from: classes.dex */
public final class C5824h extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<p086f2.InterfaceC1987b<? extends p344te.C6223e>, java.lang.Integer, android.widget.Button, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ re.C5818b f22560Z;

    public C5824h(re.C5818b r1) {
            r0 = this;
            r0.f22560Z = r1
            r1 = 3
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(p086f2.InterfaceC1987b<? extends p344te.C6223e> r3, java.lang.Integer r4, android.widget.Button r5) {
            r2 = this;
            f2.b r3 = (p086f2.InterfaceC1987b) r3
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            android.widget.Button r5 = (android.widget.Button) r5
            java.lang.String r4 = "$this$onChildViewClick"
            p214m2.C4339q.m9706k(r3, r4)
            java.lang.String r4 = "view"
            p214m2.C4339q.m9706k(r5, r4)
            re.b r4 = r2.f22560Z
            androidx.fragment.app.d0 r4 = r4.m1337u()
            java.lang.String r5 = "childFragmentManager"
            p214m2.C4339q.m9705j(r4, r5)
            java.lang.Object r3 = r3.getItem()
            te.e r3 = (p344te.C6223e) r3
            java.lang.String r5 = "fragmentManager"
            p214m2.C4339q.m9706k(r4, r5)
            java.lang.String r5 = "MListingModel"
            p214m2.C4339q.m9706k(r3, r5)
            se.c r0 = new se.c
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
