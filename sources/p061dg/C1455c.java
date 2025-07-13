package p061dg;

/* renamed from: dg.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C1455c implements p105g2.C2222p.b {

    /* renamed from: a */
    public final /* synthetic */ int f7209a;

    /* renamed from: b */
    public final /* synthetic */ p061dg.C1463k f7210b;

    public /* synthetic */ C1455c(p061dg.C1463k r2, int r3) {
            r1 = this;
            r1.f7209a = r3
            r0 = 1
            r1.<init>()
            r1.f7210b = r2
            return
    }

    @Override // p105g2.C2222p.b
    /* renamed from: a */
    public final void mo117a(java.lang.Object r6) {
            r5 = this;
            int r0 = r5.f7209a
            r1 = 0
            java.lang.String r2 = "this$0"
            switch(r0) {
                case 0: goto L50;
                case 1: goto La;
                default: goto L8;
            }
        L8:
            goto L88
        La:
            dg.k r0 = r5.f7210b
            java.lang.String r6 = (java.lang.String) r6
            p214m2.C4339q.m9706k(r0, r2)
            dg.f r1 = new dg.f
            r1.<init>()
            java.lang.reflect.Type r1 = r1.f21382b
            jb.j r2 = new jb.j
            r2.<init>()
            java.lang.Object r6 = r2.m7929c(r6, r1)
            md.v r6 = (md.C4583v) r6
            androidx.lifecycle.d0<java.util.List<java.lang.String>> r0 = r0.f7217e
            java.util.List r6 = r6.getData()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = p062dh.C1469e.m3992D(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L38:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L4c
            java.lang.Object r2 = r6.next()
            md.e r2 = (md.C4548e) r2
            java.lang.String r2 = r2.getAsset_id()
            r1.add(r2)
            goto L38
        L4c:
            r0.mo7l(r1)
            return
        L50:
            dg.k r0 = r5.f7210b
            java.lang.String r6 = (java.lang.String) r6
            p214m2.C4339q.m9706k(r0, r2)
            dg.h r2 = new dg.h
            r2.<init>()
            java.lang.reflect.Type r2 = r2.f21382b
            jb.j r3 = new jb.j
            r3.<init>()
            java.lang.Object r6 = r3.m7929c(r6, r2)
            md.h0 r6 = (md.C4556h0) r6
            androidx.lifecycle.d0<md.j0> r0 = r0.f7218f
            java.util.List r6 = r6.getRows()
            java.lang.Object r6 = p062dh.C1473i.m3996H(r6)
            md.i0 r6 = (md.C4558i0) r6
            if (r6 == 0) goto L84
            java.util.List r6 = r6.getData()
            if (r6 == 0) goto L84
            java.lang.Object r6 = p062dh.C1473i.m3996H(r6)
            r1 = r6
            md.j0 r1 = (md.C4560j0) r1
        L84:
            r0.mo7l(r1)
            return
        L88:
            dg.k r0 = r5.f7210b
            java.lang.String r6 = (java.lang.String) r6
            p214m2.C4339q.m9706k(r0, r2)
            dg.j r2 = new dg.j
            r2.<init>()
            java.lang.reflect.Type r2 = r2.f21382b
            jb.j r3 = new jb.j
            r3.<init>()
            java.lang.Object r6 = r3.m7929c(r6, r2)
            md.q0 r6 = (md.C4574q0) r6
            androidx.lifecycle.d0<md.r0> r0 = r0.f7219g
            java.util.List r6 = r6.getRows()
            java.util.Iterator r6 = r6.iterator()
        Lab:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lc5
            java.lang.Object r2 = r6.next()
            r3 = r2
            md.r0 r3 = (md.C4576r0) r3
            java.lang.String r3 = r3.getPool()
            java.lang.String r4 = "polyplaynfts"
            boolean r3 = p214m2.C4339q.m9702c(r3, r4)
            if (r3 == 0) goto Lab
            r1 = r2
        Lc5:
            r0.mo7l(r1)
            return
    }
}
