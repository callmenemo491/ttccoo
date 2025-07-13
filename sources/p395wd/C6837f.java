package p395wd;

/* renamed from: wd.f */
/* loaded from: classes.dex */
public final class C6837f extends p239nh.AbstractC4830j implements mh.InterfaceC4625q<p086f2.InterfaceC1987b<? extends p255od.C5235w>, java.lang.Integer, android.widget.Button, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ p395wd.C6833b f26592Z;

    public C6837f(p395wd.C6833b r1) {
            r0 = this;
            r0.f26592Z = r1
            r1 = 3
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4625q
    /* renamed from: i */
    public ch.C0985l mo115i(p086f2.InterfaceC1987b<? extends p255od.C5235w> r7, java.lang.Integer r8, android.widget.Button r9) {
            r6 = this;
            f2.b r7 = (p086f2.InterfaceC1987b) r7
            java.lang.Number r8 = (java.lang.Number) r8
            r8.intValue()
            android.widget.Button r9 = (android.widget.Button) r9
            java.lang.String r8 = "$this$onChildViewClick"
            p214m2.C4339q.m9706k(r7, r8)
            java.lang.String r8 = "view"
            p214m2.C4339q.m9706k(r9, r8)
            wd.b r8 = r6.f26592Z
            int r0 = p395wd.C6833b.f26579n1
            wd.l r8 = r8.m13915O0()
            android.content.Context r1 = r9.getContext()
            java.lang.String r9 = "view.context"
            p214m2.C4339q.m9705j(r1, r9)
            java.lang.Object r7 = r7.getItem()
            od.w r7 = (p255od.C5235w) r7
            java.util.Objects.requireNonNull(r8)
            java.lang.String r9 = "context"
            p214m2.C4339q.m9706k(r1, r9)
            java.lang.String r0 = "ingredientUi"
            p214m2.C4339q.m9706k(r7, r0)
            nd.b0 r2 = r8.f26596c
            wd.h r5 = new wd.h
            r5.<init>(r8)
            java.util.Objects.requireNonNull(r2)
            p214m2.C4339q.m9706k(r1, r9)
            p214m2.C4339q.m9706k(r7, r0)
            java.lang.String r8 = "completion"
            p214m2.C4339q.m9706k(r5, r8)
            od.s0 r8 = new od.s0
            java.util.List r9 = r7.getAssets_id()
            int r7 = r7.getSelected()
            java.util.List r7 = p062dh.C1473i.m4005Q(r9, r7)
            java.lang.String r9 = "f.taco"
            java.lang.String r0 = "ingredients transfer"
            r8.<init>(r9, r7, r0)
            r3 = 0
            r4 = 0
            r0 = r2
            r2 = r8
            r0.m10807u(r1, r2, r3, r4, r5)
            ch.l r7 = ch.C0985l.f5061a
            return r7
    }
}
