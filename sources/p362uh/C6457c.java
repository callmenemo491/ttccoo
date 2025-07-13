package p362uh;

/* renamed from: uh.c */
/* loaded from: classes.dex */
public final class C6457c implements java.io.Serializable {

    /* renamed from: Y */
    public final java.util.regex.Pattern f25047Y;

    public C6457c(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "pattern"
            p214m2.C4339q.m9706k(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            p214m2.C4339q.m9705j(r2, r0)
            java.lang.String r0 = "nativePattern"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.f25047Y = r2
            return
    }

    /* renamed from: a */
    public final boolean m13043a(java.lang.CharSequence r2) {
            r1 = this;
            java.util.regex.Pattern r0 = r1.f25047Y
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.matches()
            return r2
    }

    /* renamed from: b */
    public final java.lang.String m13044b(java.lang.CharSequence r2, java.lang.String r3) {
            r1 = this;
            java.util.regex.Pattern r0 = r1.f25047Y
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r3)
            java.lang.String r3 = "nativePattern.matcher(in\u2026).replaceAll(replacement)"
            p214m2.C4339q.m9705j(r2, r3)
            return r2
    }

    public java.lang.String toString() {
            r2 = this;
            java.util.regex.Pattern r0 = r2.f25047Y
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "nativePattern.toString()"
            p214m2.C4339q.m9705j(r0, r1)
            return r0
    }
}
