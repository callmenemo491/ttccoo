package pe;

/* renamed from: pe.h */
/* loaded from: classes.dex */
public final /* synthetic */ class C5486h implements p105g2.C2222p.b {

    /* renamed from: a */
    public final /* synthetic */ int f21418a;

    /* renamed from: b */
    public final /* synthetic */ java.lang.Object f21419b;

    /* renamed from: c */
    public final /* synthetic */ java.lang.Object f21420c;

    public /* synthetic */ C5486h(gg.C2369g r2, mh.InterfaceC4620l r3) {
            r1 = this;
            r0 = 1
            r1.f21418a = r0
            r1.<init>()
            r1.f21419b = r2
            r1.f21420c = r3
            return
    }

    public /* synthetic */ C5486h(pe.C5491m r2, java.util.List r3) {
            r1 = this;
            r0 = 0
            r1.f21418a = r0
            r1.<init>()
            r1.f21419b = r2
            r1.f21420c = r3
            return
    }

    @Override // p105g2.C2222p.b
    /* renamed from: a */
    public final void mo117a(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f21418a
            java.lang.String r1 = "this$0"
            switch(r0) {
                case 0: goto L9;
                default: goto L7;
            }
        L7:
            goto L9c
        L9:
            java.lang.Object r0 = r8.f21419b
            pe.m r0 = (pe.C5491m) r0
            java.lang.Object r2 = r8.f21420c
            java.util.List r2 = (java.util.List) r2
            java.lang.String r9 = (java.lang.String) r9
            p214m2.C4339q.m9706k(r0, r1)
            java.lang.String r1 = "$templateIds"
            p214m2.C4339q.m9706k(r2, r1)
            pe.j r1 = new pe.j
            r1.<init>()
            java.lang.reflect.Type r1 = r1.f21382b
            jb.j r3 = new jb.j
            r3.<init>()
            java.lang.Object r9 = r3.m7929c(r9, r1)
            qe.a r9 = (p293qe.C5628a) r9
            java.util.List r9 = r9.getData()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L3a:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r9.next()
            r4 = r3
            qe.e r4 = (p293qe.C5632e) r4
            java.lang.String r4 = r4.getTemplate_id()
            boolean r4 = r2.contains(r4)
            if (r4 == 0) goto L3a
            r1.add(r3)
            goto L3a
        L55:
            androidx.lifecycle.d0<java.util.List<qe.e>> r9 = r0.f21427g
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L60:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L91
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.util.Iterator r5 = r1.iterator()
        L70:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L88
            java.lang.Object r6 = r5.next()
            r7 = r6
            qe.e r7 = (p293qe.C5632e) r7
            java.lang.String r7 = r7.getTemplate_id()
            boolean r7 = p214m2.C4339q.m9702c(r7, r4)
            if (r7 == 0) goto L70
            goto L89
        L88:
            r6 = 0
        L89:
            qe.e r6 = (p293qe.C5632e) r6
            if (r6 == 0) goto L60
            r3.add(r6)
            goto L60
        L91:
            r9.mo7l(r3)
            androidx.lifecycle.d0<java.lang.Boolean> r9 = r0.f21425e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r9.mo7l(r0)
            return
        L9c:
            java.lang.Object r0 = r8.f21419b
            gg.g r0 = (gg.C2369g) r0
            java.lang.Object r2 = r8.f21420c
            mh.l r2 = (mh.InterfaceC4620l) r2
            java.lang.String r9 = (java.lang.String) r9
            p214m2.C4339q.m9706k(r0, r1)
            java.lang.String r1 = "$completion"
            p214m2.C4339q.m9706k(r2, r1)
            gg.v r1 = new gg.v
            r1.<init>()
            java.lang.reflect.Type r1 = r1.f21382b
            jb.j r3 = new jb.j
            r3.<init>()
            java.lang.Object r9 = r3.m7929c(r9, r1)
            od.d r9 = (p255od.C5197d) r9
            java.util.List r9 = r9.getData()
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r3 = p062dh.C1469e.m3992D(r9, r3)
            r1.<init>(r3)
            java.util.Iterator r9 = r9.iterator()
        Ld3:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto Le7
            java.lang.Object r3 = r9.next()
            od.q r3 = (p255od.C5223q) r3
            java.lang.String r3 = r3.getAssetID()
            r1.add(r3)
            goto Ld3
        Le7:
            boolean r9 = r1.isEmpty()
            if (r9 == 0) goto Lf2
            androidx.lifecycle.d0<java.lang.Boolean> r9 = r0.f10714i
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto Lf9
        Lf2:
            r2.mo107b(r1)
            androidx.lifecycle.d0<java.lang.Boolean> r9 = r0.f10714i
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        Lf9:
            r9.mo7l(r0)
            return
    }
}
