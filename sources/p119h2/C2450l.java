package p119h2;

/* renamed from: h2.l */
/* loaded from: classes.dex */
public class C2450l {
    /* renamed from: a */
    public static p105g2.C2221o m6226a(android.content.Context r6) {
            h2.b r0 = new h2.b
            h2.g r1 = new h2.g
            r1.<init>()
            r0.<init>(r1)
            android.content.Context r6 = r6.getApplicationContext()
            h2.k r1 = new h2.k
            r1.<init>(r6)
            g2.o r6 = new g2.o
            h2.d r2 = new h2.d
            r2.<init>(r1)
            r6.<init>(r2, r0)
            g2.d r0 = r6.f10168i
            r1 = 1
            if (r0 == 0) goto L27
            r0.f10119c0 = r1
            r0.interrupt()
        L27:
            g2.j[] r0 = r6.f10167h
            int r2 = r0.length
            r3 = 0
            r4 = 0
        L2c:
            if (r4 >= r2) goto L3a
            r5 = r0[r4]
            if (r5 == 0) goto L37
            r5.f10134c0 = r1
            r5.interrupt()
        L37:
            int r4 = r4 + 1
            goto L2c
        L3a:
            g2.d r0 = new g2.d
            java.util.concurrent.PriorityBlockingQueue<g2.n<?>> r1 = r6.f10162c
            java.util.concurrent.PriorityBlockingQueue<g2.n<?>> r2 = r6.f10163d
            g2.b r4 = r6.f10164e
            g2.q r5 = r6.f10166g
            r0.<init>(r1, r2, r4, r5)
            r6.f10168i = r0
            r0.start()
        L4c:
            g2.j[] r0 = r6.f10167h
            int r0 = r0.length
            if (r3 >= r0) goto L68
            g2.j r0 = new g2.j
            java.util.concurrent.PriorityBlockingQueue<g2.n<?>> r1 = r6.f10163d
            g2.i r2 = r6.f10165f
            g2.b r4 = r6.f10164e
            g2.q r5 = r6.f10166g
            r0.<init>(r1, r2, r4, r5)
            g2.j[] r1 = r6.f10167h
            r1[r3] = r0
            r0.start()
            int r3 = r3 + 1
            goto L4c
        L68:
            return r6
    }
}
