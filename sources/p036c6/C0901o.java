package p036c6;

/* renamed from: c6.o */
/* loaded from: classes.dex */
public class C0901o {

    /* renamed from: a */
    public final long f4820a;

    /* renamed from: b */
    public final int f4821b;

    /* renamed from: c */
    public final boolean f4822c;

    /* renamed from: d */
    public final org.json.JSONObject f4823d;

    public /* synthetic */ C0901o(long r1, int r3, boolean r4, org.json.JSONObject r5) {
            r0 = this;
            r0.<init>()
            r0.f4820a = r1
            r0.f4821b = r3
            r0.f4822c = r4
            r0.f4823d = r5
            return
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p036c6.C0901o
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            c6.o r8 = (p036c6.C0901o) r8
            long r3 = r7.f4820a
            long r5 = r8.f4820a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L2b
            int r1 = r7.f4821b
            int r3 = r8.f4821b
            if (r1 != r3) goto L2b
            boolean r1 = r7.f4822c
            boolean r3 = r8.f4822c
            if (r1 != r3) goto L2b
            org.json.JSONObject r1 = r7.f4823d
            org.json.JSONObject r8 = r8.f4823d
            boolean r8 = p248o6.C4924o.m11074a(r1, r8)
            if (r8 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    public int hashCode() {
            r3 = this;
            r0 = 4
            java.lang.Object[] r0 = new java.lang.Object[r0]
            long r1 = r3.f4820a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            int r1 = r3.f4821b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.f4822c
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2 = 2
            r0[r2] = r1
            org.json.JSONObject r1 = r3.f4823d
            r2 = 3
            r0[r2] = r1
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
