package p235n8;

/* renamed from: n8.f */
/* loaded from: classes.dex */
public class C4699f implements p220m8.C4430n.b {
    public C4699f(p235n8.AbstractC4698e r1) {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p220m8.C4430n.b
    /* renamed from: a */
    public p227n0.C4642a0 mo35a(android.view.View r6, p227n0.C4642a0 r7, p220m8.C4430n.c r8) {
            r5 = this;
            int r0 = r8.f18090d
            int r1 = r7.m10465a()
            int r1 = r1 + r0
            r8.f18090d = r1
            java.util.WeakHashMap<android.view.View, n0.w> r0 = p227n0.C4661t.f18570a
            int r0 = p227n0.C4661t.d.m10575d(r6)
            r1 = 1
            if (r0 != r1) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            int r0 = r7.m10466b()
            int r2 = r7.m10467c()
            int r3 = r8.f18087a
            if (r1 == 0) goto L22
            r4 = r2
            goto L23
        L22:
            r4 = r0
        L23:
            int r3 = r3 + r4
            r8.f18087a = r3
            int r4 = r8.f18089c
            if (r1 == 0) goto L2b
            goto L2c
        L2b:
            r0 = r2
        L2c:
            int r4 = r4 + r0
            r8.f18089c = r4
            int r0 = r8.f18088b
            int r8 = r8.f18090d
            p227n0.C4661t.d.m10582k(r6, r3, r0, r4, r8)
            return r7
    }
}
