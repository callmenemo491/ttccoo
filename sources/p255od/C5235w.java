package p255od;

/* renamed from: od.w */
/* loaded from: classes.dex */
public final class C5235w {
    private final java.util.List<java.lang.String> assets_id;
    private final int count;
    private final p255od.C5231u ingredient;
    private int selected;

    public C5235w(p255od.C5231u r2, int r3, int r4, java.util.List<java.lang.String> r5) {
            r1 = this;
            java.lang.String r0 = "ingredient"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "assets_id"
            p214m2.C4339q.m9706k(r5, r0)
            r1.<init>()
            r1.ingredient = r2
            r1.count = r3
            r1.selected = r4
            r1.assets_id = r5
            return
    }

    public static /* synthetic */ p255od.C5235w copy$default(p255od.C5235w r0, p255od.C5231u r1, int r2, int r3, java.util.List r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            od.u r1 = r0.ingredient
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            int r2 = r0.count
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            int r3 = r0.selected
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            java.util.List<java.lang.String> r4 = r0.assets_id
        L18:
            od.w r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final p255od.C5231u component1() {
            r1 = this;
            od.u r0 = r1.ingredient
            return r0
    }

    public final int component2() {
            r1 = this;
            int r0 = r1.count
            return r0
    }

    public final int component3() {
            r1 = this;
            int r0 = r1.selected
            return r0
    }

    public final java.util.List<java.lang.String> component4() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.assets_id
            return r0
    }

    public final p255od.C5235w copy(p255od.C5231u r2, int r3, int r4, java.util.List<java.lang.String> r5) {
            r1 = this;
            java.lang.String r0 = "ingredient"
            p214m2.C4339q.m9706k(r2, r0)
            java.lang.String r0 = "assets_id"
            p214m2.C4339q.m9706k(r5, r0)
            od.w r0 = new od.w
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p255od.C5235w
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            od.w r5 = (p255od.C5235w) r5
            od.u r1 = r4.ingredient
            od.u r3 = r5.ingredient
            boolean r1 = p214m2.C4339q.m9702c(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.count
            int r3 = r5.count
            if (r1 == r3) goto L1e
            return r2
        L1e:
            int r1 = r4.selected
            int r3 = r5.selected
            if (r1 == r3) goto L25
            return r2
        L25:
            java.util.List<java.lang.String> r1 = r4.assets_id
            java.util.List<java.lang.String> r5 = r5.assets_id
            boolean r5 = p214m2.C4339q.m9702c(r1, r5)
            if (r5 != 0) goto L30
            return r2
        L30:
            return r0
    }

    public final java.util.List<java.lang.String> getAssets_id() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.assets_id
            return r0
    }

    public final int getCount() {
            r1 = this;
            int r0 = r1.count
            return r0
    }

    public final p255od.C5231u getIngredient() {
            r1 = this;
            od.u r0 = r1.ingredient
            return r0
    }

    public final int getSelected() {
            r1 = this;
            int r0 = r1.selected
            return r0
    }

    public int hashCode() {
            r2 = this;
            od.u r0 = r2.ingredient
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.count
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.selected
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<java.lang.String> r1 = r2.assets_id
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final void setSelected(int r1) {
            r0 = this;
            r0.selected = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = "IngredientUi(ingredient="
            java.lang.StringBuilder r0 = android.support.v4.media.C0144c.m256a(r0)
            od.u r1 = r3.ingredient
            r0.append(r1)
            java.lang.String r1 = ", count="
            r0.append(r1)
            int r1 = r3.count
            r0.append(r1)
            java.lang.String r1 = ", selected="
            r0.append(r1)
            int r1 = r3.selected
            r0.append(r1)
            java.lang.String r1 = ", assets_id="
            r0.append(r1)
            java.util.List<java.lang.String> r1 = r3.assets_id
            r2 = 41
            java.lang.String r0 = p213m1.C4320f.m9652a(r0, r1, r2)
            return r0
    }
}
