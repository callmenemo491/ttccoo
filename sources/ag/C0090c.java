package ag;

/* renamed from: ag.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0090c implements p105g2.C2222p.b {

    /* renamed from: a */
    public final /* synthetic */ int f314a;

    /* renamed from: b */
    public final /* synthetic */ ag.C0098k f315b;

    public /* synthetic */ C0090c(ag.C0098k r2, int r3) {
            r1 = this;
            r1.f314a = r3
            r0 = 1
            r1.<init>()
            r1.f315b = r2
            return
    }

    @Override // p105g2.C2222p.b
    /* renamed from: a */
    public final void mo117a(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.f314a
            java.lang.String r1 = "rookie"
            r2 = 0
            r3 = 10
            java.lang.String r4 = "this$0"
            switch(r0) {
                case 0: goto Lf0;
                case 1: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L134
        Le:
            ag.k r0 = r8.f315b
            java.lang.String r9 = (java.lang.String) r9
            p214m2.C4339q.m9706k(r0, r4)
            ag.h r4 = new ag.h
            r4.<init>()
            java.lang.reflect.Type r4 = r4.f21382b
            jb.j r5 = new jb.j
            r5.<init>()
            java.lang.Object r9 = r5.m7929c(r9, r4)
            md.y r9 = (md.C4589y) r9
            androidx.lifecycle.d0<md.a0> r4 = r0.f323f
            java.util.List r5 = r9.getRows()
            java.lang.Object r5 = p062dh.C1473i.m3996H(r5)
            md.z r5 = (md.C4591z) r5
            if (r5 == 0) goto L59
            java.util.List r5 = r5.getData()
            if (r5 == 0) goto L59
            java.util.Iterator r5 = r5.iterator()
        L3f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L57
            java.lang.Object r6 = r5.next()
            r7 = r6
            md.a0 r7 = (md.C4537a0) r7
            java.lang.String r7 = r7.getPool()
            boolean r7 = p214m2.C4339q.m9702c(r7, r1)
            if (r7 == 0) goto L3f
            r2 = r6
        L57:
            md.a0 r2 = (md.C4537a0) r2
        L59:
            r4.mo7l(r2)
            java.util.List r9 = r9.getRows()
            java.lang.Object r9 = p062dh.C1473i.m3996H(r9)
            md.z r9 = (md.C4591z) r9
            r1 = 0
            if (r9 == 0) goto Le6
            java.util.List r9 = r9.getData()
            if (r9 == 0) goto Le6
            java.util.ArrayList r2 = new java.util.ArrayList
            int r4 = p062dh.C1469e.m3992D(r9, r3)
            r2.<init>(r4)
            java.util.Iterator r9 = r9.iterator()
        L7c:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto Ld0
            java.lang.Object r4 = r9.next()
            md.a0 r4 = (md.C4537a0) r4
            java.util.List r4 = r4.getRarities()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = p062dh.C1469e.m3992D(r4, r3)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L99:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Lb1
            java.lang.Object r6 = r4.next()
            md.b0 r6 = (md.C4540b0) r6
            int r6 = r6.getValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            goto L99
        Lb1:
            java.util.Iterator r4 = r5.iterator()
            r5 = 0
        Lb6:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto Lc8
            java.lang.Object r6 = r4.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            int r5 = r5 + r6
            goto Lb6
        Lc8:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r2.add(r4)
            goto L7c
        Ld0:
            java.util.Iterator r9 = r2.iterator()
        Ld4:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Le6
            java.lang.Object r2 = r9.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r1 = r1 + r2
            goto Ld4
        Le6:
            androidx.lifecycle.d0<java.lang.Integer> r9 = r0.f326i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r9.mo7l(r0)
            return
        Lf0:
            ag.k r0 = r8.f315b
            java.lang.String r9 = (java.lang.String) r9
            p214m2.C4339q.m9706k(r0, r4)
            ag.f r1 = new ag.f
            r1.<init>()
            java.lang.reflect.Type r1 = r1.f21382b
            jb.j r2 = new jb.j
            r2.<init>()
            java.lang.Object r9 = r2.m7929c(r9, r1)
            md.v r9 = (md.C4583v) r9
            androidx.lifecycle.d0<java.util.List<java.lang.String>> r0 = r0.f322e
            java.util.List r9 = r9.getData()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = p062dh.C1469e.m3992D(r9, r3)
            r1.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L11c:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L130
            java.lang.Object r2 = r9.next()
            md.e r2 = (md.C4548e) r2
            java.lang.String r2 = r2.getAsset_id()
            r1.add(r2)
            goto L11c
        L130:
            r0.mo7l(r1)
            return
        L134:
            ag.k r0 = r8.f315b
            java.lang.String r9 = (java.lang.String) r9
            p214m2.C4339q.m9706k(r0, r4)
            ag.j r3 = new ag.j
            r3.<init>()
            java.lang.reflect.Type r3 = r3.f21382b
            jb.j r4 = new jb.j
            r4.<init>()
            java.lang.Object r9 = r4.m7929c(r9, r3)
            md.d0 r9 = (md.C4546d0) r9
            androidx.lifecycle.d0<md.f0> r0 = r0.f324g
            java.util.List r9 = r9.getRows()
            java.util.Iterator r9 = r9.iterator()
        L157:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L16f
            java.lang.Object r3 = r9.next()
            r4 = r3
            md.f0 r4 = (md.C4552f0) r4
            java.lang.String r4 = r4.getPool()
            boolean r4 = p214m2.C4339q.m9702c(r4, r1)
            if (r4 == 0) goto L157
            r2 = r3
        L16f:
            r0.mo7l(r2)
            return
    }
}
