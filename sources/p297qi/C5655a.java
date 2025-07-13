package p297qi;

/* renamed from: qi.a */
/* loaded from: classes.dex */
public class C5655a extends java.lang.IllegalArgumentException {

    /* renamed from: qi.a$a */
    public static class a extends p297qi.C5655a {
        public a(char r2, int r3) {
                r1 = this;
                java.lang.String r0 = "Invalid character '"
                java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
                java.lang.String r2 = java.lang.Character.toString(r2)
                r0.append(r2)
                java.lang.String r2 = "' at position "
                r0.append(r2)
                r0.append(r3)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
        }
    }

    public C5655a(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }
}
