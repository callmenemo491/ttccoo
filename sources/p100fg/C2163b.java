package p100fg;

/* renamed from: fg.b */
/* loaded from: classes.dex */
public final class C2163b {
    private final java.util.List<p100fg.C2162a> templates;

    public C2163b(java.util.List<p100fg.C2162a> r2) {
            r1 = this;
            java.lang.String r0 = "templates"
            p214m2.C4339q.m9706k(r2, r0)
            r1.<init>()
            r1.templates = r2
            return
    }

    public static /* synthetic */ p100fg.C2163b copy$default(p100fg.C2163b r0, java.util.List r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            java.util.List<fg.a> r1 = r0.templates
        L6:
            fg.b r0 = r0.copy(r1)
            return r0
    }

    public final java.util.List<p100fg.C2162a> component1() {
            r1 = this;
            java.util.List<fg.a> r0 = r1.templates
            return r0
    }

    public final p100fg.C2163b copy(java.util.List<p100fg.C2162a> r2) {
            r1 = this;
            java.lang.String r0 = "templates"
            p214m2.C4339q.m9706k(r2, r0)
            fg.b r0 = new fg.b
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p100fg.C2163b
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            fg.b r4 = (p100fg.C2163b) r4
            java.util.List<fg.a> r1 = r3.templates
            java.util.List<fg.a> r4 = r4.templates
            boolean r4 = p214m2.C4339q.m9702c(r1, r4)
            if (r4 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final java.util.List<p100fg.C2162a> getTemplates() {
            r1 = this;
            java.util.List<fg.a> r0 = r1.templates
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.util.List<fg.a> r0 = r1.templates
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "ReptileData(templates="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            java.util.List<fg.a> r1 = r3.templates
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
