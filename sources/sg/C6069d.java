package sg;

/* renamed from: sg.d */
/* loaded from: classes.dex */
public final class C6069d extends p239nh.AbstractC4830j implements mh.InterfaceC4624p<p086f2.InterfaceC1987b<? extends sg.C6071f.a>, java.lang.Integer, ch.C0985l> {

    /* renamed from: Z */
    public final /* synthetic */ sg.C6066a f23429Z;

    public C6069d(sg.C6066a r1) {
            r0 = this;
            r0.f23429Z = r1
            r1 = 2
            r0.<init>(r1)
            return
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public ch.C0985l mo122l(p086f2.InterfaceC1987b<? extends sg.C6071f.a> r6, java.lang.Integer r7) {
            r5 = this;
            f2.b r6 = (p086f2.InterfaceC1987b) r6
            java.lang.Number r7 = (java.lang.Number) r7
            r7.intValue()
            java.lang.String r7 = "$this$onClickAvoidReclick"
            p214m2.C4339q.m9706k(r6, r7)
            sg.a r7 = r5.f23429Z
            int r0 = sg.C6066a.f23417o1
            sg.f r7 = r7.m12525P0()
            java.lang.Object r6 = r6.getItem()
            sg.f$a r6 = (sg.C6071f.a) r6
            java.util.Objects.requireNonNull(r7)
            java.lang.String r0 = "item"
            p214m2.C4339q.m9706k(r6, r0)
            boolean r0 = r6.f23438c
            if (r0 == 0) goto L64
            nd.b0 r6 = r7.f23431c
            androidx.lifecycle.LiveData<java.util.List<id.b>> r6 = r6.f18925u
            java.lang.Object r6 = r6.m1411d()
            java.util.List r6 = (java.util.List) r6
            if (r6 != 0) goto L33
            goto L79
        L33:
            java.util.Iterator r6 = r6.iterator()
        L37:
            boolean r0 = r6.hasNext()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L52
            java.lang.Object r0 = r6.next()
            r3 = r0
            id.b r3 = (id.C3131b) r3
            od.v0 r3 = r3.f12560b
            od.v0 r4 = p255od.EnumC5234v0.WAX_CLOUD_WALLET
            if (r3 != r4) goto L4e
            r3 = 1
            goto L4f
        L4e:
            r3 = 0
        L4f:
            if (r3 == 0) goto L37
            goto L53
        L52:
            r0 = 0
        L53:
            if (r0 == 0) goto L56
            r1 = 1
        L56:
            androidx.lifecycle.d0<vg.b<java.lang.Boolean>> r6 = r7.f23434f
            vg.b r7 = new vg.b
            r0 = r1 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.<init>(r0)
            goto L76
        L64:
            nd.b0 r0 = r7.f23431c
            id.b r6 = r6.f23436a
            androidx.lifecycle.d0<id.b> r0 = r0.f18922r
            r0.mo7l(r6)
            androidx.lifecycle.d0<vg.b<ch.l>> r6 = r7.f23435g
            vg.b r7 = new vg.b
            ch.l r0 = ch.C0985l.f5061a
            r7.<init>(r0)
        L76:
            r6.mo7l(r7)
        L79:
            ch.l r6 = ch.C0985l.f5061a
            return r6
    }
}
