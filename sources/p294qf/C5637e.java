package p294qf;

/* renamed from: qf.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C5637e implements p105g2.C2222p.b {

    /* renamed from: a */
    public final /* synthetic */ int f21932a;

    /* renamed from: b */
    public final /* synthetic */ p294qf.C5645m f21933b;

    public /* synthetic */ C5637e(p294qf.C5645m r2, int r3) {
            r1 = this;
            r1.f21932a = r3
            r0 = 1
            r1.<init>()
            r1.f21933b = r2
            return
    }

    @Override // p105g2.C2222p.b
    /* renamed from: a */
    public final void mo117a(java.lang.Object r8) {
            r7 = this;
            int r0 = r7.f21932a
            r1 = 10
            java.lang.String r2 = "this$0"
            switch(r0) {
                case 0: goto Lcf;
                case 1: goto Lb;
                default: goto L9;
            }
        L9:
            goto L113
        Lb:
            qf.m r0 = r7.f21933b
            java.lang.String r8 = (java.lang.String) r8
            p214m2.C4339q.m9706k(r0, r2)
            qf.j r2 = new qf.j
            r2.<init>()
            java.lang.reflect.Type r2 = r2.f21382b
            jb.j r3 = new jb.j
            r3.<init>()
            java.lang.Object r8 = r3.m7929c(r8, r2)
            md.y r8 = (md.C4589y) r8
            androidx.lifecycle.d0<java.util.List<md.a0>> r2 = r0.f21941f
            java.util.List r3 = r8.getRows()
            java.lang.Object r3 = p062dh.C1473i.m3996H(r3)
            md.z r3 = (md.C4591z) r3
            if (r3 == 0) goto L37
            java.util.List r3 = r3.getData()
            goto L38
        L37:
            r3 = 0
        L38:
            r2.mo7l(r3)
            java.util.List r8 = r8.getRows()
            java.lang.Object r8 = p062dh.C1473i.m3996H(r8)
            md.z r8 = (md.C4591z) r8
            r2 = 0
            if (r8 == 0) goto Lc5
            java.util.List r8 = r8.getData()
            if (r8 == 0) goto Lc5
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = p062dh.C1469e.m3992D(r8, r1)
            r3.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L5b:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto Laf
            java.lang.Object r4 = r8.next()
            md.a0 r4 = (md.C4537a0) r4
            java.util.List r4 = r4.getRarities()
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = p062dh.C1469e.m3992D(r4, r1)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L78:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L90
            java.lang.Object r6 = r4.next()
            md.b0 r6 = (md.C4540b0) r6
            int r6 = r6.getValue()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.add(r6)
            goto L78
        L90:
            java.util.Iterator r4 = r5.iterator()
            r5 = 0
        L95:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto La7
            java.lang.Object r6 = r4.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            int r5 = r5 + r6
            goto L95
        La7:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r3.add(r4)
            goto L5b
        Laf:
            java.util.Iterator r8 = r3.iterator()
        Lb3:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lc5
            java.lang.Object r1 = r8.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r2 = r2 + r1
            goto Lb3
        Lc5:
            androidx.lifecycle.d0<java.lang.Integer> r8 = r0.f21944i
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r8.mo7l(r0)
            return
        Lcf:
            qf.m r0 = r7.f21933b
            java.lang.String r8 = (java.lang.String) r8
            p214m2.C4339q.m9706k(r0, r2)
            qf.h r2 = new qf.h
            r2.<init>()
            java.lang.reflect.Type r2 = r2.f21382b
            jb.j r3 = new jb.j
            r3.<init>()
            java.lang.Object r8 = r3.m7929c(r8, r2)
            md.v r8 = (md.C4583v) r8
            androidx.lifecycle.d0<java.util.List<java.lang.String>> r0 = r0.f21940e
            java.util.List r8 = r8.getData()
            java.util.ArrayList r2 = new java.util.ArrayList
            int r1 = p062dh.C1469e.m3992D(r8, r1)
            r2.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        Lfb:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L10f
            java.lang.Object r1 = r8.next()
            md.e r1 = (md.C4548e) r1
            java.lang.String r1 = r1.getAsset_id()
            r2.add(r1)
            goto Lfb
        L10f:
            r0.mo7l(r2)
            return
        L113:
            qf.m r0 = r7.f21933b
            java.lang.String r8 = (java.lang.String) r8
            p214m2.C4339q.m9706k(r0, r2)
            qf.l r1 = new qf.l
            r1.<init>()
            java.lang.reflect.Type r1 = r1.f21382b
            jb.j r2 = new jb.j
            r2.<init>()
            java.lang.Object r8 = r2.m7929c(r8, r1)
            md.p r8 = (md.C4571p) r8
            androidx.lifecycle.d0<java.util.List<md.r>> r0 = r0.f21942g
            java.util.List r8 = r8.getRows()
            r0.mo7l(r8)
            return
    }
}
