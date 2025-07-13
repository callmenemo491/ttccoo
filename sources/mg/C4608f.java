package mg;

/* renamed from: mg.f */
/* loaded from: classes.dex */
public final class C4608f {

    @p189kb.InterfaceC4079b("global_sequence")
    private final long globalSequence;

    public C4608f(long r1) {
            r0 = this;
            r0.<init>()
            r0.globalSequence = r1
            return
    }

    public static /* synthetic */ mg.C4608f copy$default(mg.C4608f r0, long r1, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            long r1 = r0.globalSequence
        L6:
            mg.f r0 = r0.copy(r1)
            return r0
    }

    public final long component1() {
            r2 = this;
            long r0 = r2.globalSequence
            return r0
    }

    public final mg.C4608f copy(long r2) {
            r1 = this;
            mg.f r0 = new mg.f
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof mg.C4608f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mg.f r8 = (mg.C4608f) r8
            long r3 = r7.globalSequence
            long r5 = r8.globalSequence
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L15
            return r2
        L15:
            return r0
    }

    public final long getGlobalSequence() {
            r2 = this;
            long r0 = r2.globalSequence
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.globalSequence
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r1 = (int) r0
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "Receipt(globalSequence="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            long r1 = r3.globalSequence
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
