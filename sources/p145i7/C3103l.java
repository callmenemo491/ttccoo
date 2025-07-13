package p145i7;

/* renamed from: i7.l */
/* loaded from: classes.dex */
public final class C3103l {

    /* renamed from: a */
    public static final /* synthetic */ int f12493a = 0;

    static {
            i7.j r0 = new i7.j
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static byte[] m7570a(java.util.Queue<byte[]> r6, int r7) {
            byte[] r0 = new byte[r7]
            r1 = r7
        L3:
            if (r1 <= 0) goto L18
            java.lang.Object r2 = r6.remove()
            byte[] r2 = (byte[]) r2
            int r3 = r2.length
            int r3 = java.lang.Math.min(r1, r3)
            r4 = 0
            int r5 = r7 - r1
            java.lang.System.arraycopy(r2, r4, r0, r5, r3)
            int r1 = r1 - r3
            goto L3
        L18:
            return r0
    }
}
