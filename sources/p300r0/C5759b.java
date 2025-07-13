package p300r0;

/* renamed from: r0.b */
/* loaded from: classes.dex */
public class C5759b extends android.widget.Filter {

    /* renamed from: a */
    public p300r0.C5759b.a f22177a;

    /* renamed from: r0.b$a */
    public interface a {
    }

    public C5759b(p300r0.C5759b.a r1) {
            r0 = this;
            r0.<init>()
            r0.f22177a = r1
            return
    }

    @Override // android.widget.Filter
    public java.lang.CharSequence convertResultToString(java.lang.Object r2) {
            r1 = this;
            r0.b$a r0 = r1.f22177a
            android.database.Cursor r2 = (android.database.Cursor) r2
            androidx.appcompat.widget.s0 r0 = (androidx.appcompat.widget.ViewOnClickListenerC0302s0) r0
            java.lang.CharSequence r2 = r0.mo781c(r2)
            return r2
    }

    @Override // android.widget.Filter
    public android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r5) {
            r4 = this;
            r0.b$a r0 = r4.f22177a
            androidx.appcompat.widget.s0 r0 = (androidx.appcompat.widget.ViewOnClickListenerC0302s0) r0
            java.util.Objects.requireNonNull(r0)
            if (r5 != 0) goto Lc
            java.lang.String r5 = ""
            goto L10
        Lc:
            java.lang.String r5 = r5.toString()
        L10:
            androidx.appcompat.widget.SearchView r1 = r0.f1414j0
            int r1 = r1.getVisibility()
            r2 = 0
            if (r1 != 0) goto L38
            androidx.appcompat.widget.SearchView r1 = r0.f1414j0
            int r1 = r1.getWindowVisibility()
            if (r1 == 0) goto L22
            goto L38
        L22:
            android.app.SearchableInfo r1 = r0.f1415k0     // Catch: java.lang.RuntimeException -> L30
            r3 = 50
            android.database.Cursor r5 = r0.m785g(r1, r5, r3)     // Catch: java.lang.RuntimeException -> L30
            if (r5 == 0) goto L38
            r5.getCount()     // Catch: java.lang.RuntimeException -> L30
            goto L39
        L30:
            r5 = move-exception
            java.lang.String r0 = "SuggestionsAdapter"
            java.lang.String r1 = "Search suggestions query threw an exception."
            android.util.Log.w(r0, r1, r5)
        L38:
            r5 = r2
        L39:
            android.widget.Filter$FilterResults r0 = new android.widget.Filter$FilterResults
            r0.<init>()
            if (r5 == 0) goto L49
            int r1 = r5.getCount()
            r0.count = r1
            r0.values = r5
            goto L4e
        L49:
            r5 = 0
            r0.count = r5
            r0.values = r2
        L4e:
            return r0
    }

    @Override // android.widget.Filter
    public void publishResults(java.lang.CharSequence r2, android.widget.Filter.FilterResults r3) {
            r1 = this;
            r0.b$a r2 = r1.f22177a
            r0 = r2
            r0.a r0 = (p300r0.AbstractC5758a) r0
            android.database.Cursor r0 = r0.f22169a0
            java.lang.Object r3 = r3.values
            if (r3 == 0) goto L14
            if (r3 == r0) goto L14
            android.database.Cursor r3 = (android.database.Cursor) r3
            androidx.appcompat.widget.s0 r2 = (androidx.appcompat.widget.ViewOnClickListenerC0302s0) r2
            r2.mo780b(r3)
        L14:
            return
    }
}
