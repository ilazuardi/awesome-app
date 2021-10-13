package com.irfan.awesomeapp.core.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 $2\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002$%B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u001c\u0010\u0018\u001a\u00020\u000f2\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0015H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0015H\u0016J\u0018\u0010\u001e\u001a\u00020\u000f2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010 H\u0007J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#H\u0016R\u001a\u0010\u0006\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006&"}, d2 = {"Lcom/irfan/awesomeapp/core/ui/PhotoListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/irfan/awesomeapp/core/ui/PhotoListAdapter$ViewHolder;", "layoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "(Landroidx/recyclerview/widget/GridLayoutManager;)V", "gridLayoutManager", "getGridLayoutManager", "()Landroidx/recyclerview/widget/GridLayoutManager;", "setGridLayoutManager", "listPhoto", "Ljava/util/ArrayList;", "Lcom/irfan/awesomeapp/core/domain/model/Photo;", "onItemClick", "Lkotlin/Function1;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "newListPhoto", "", "setHasStableIds", "hasStableIds", "", "Companion", "ViewHolder", "app_debug"})
public final class PhotoListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.irfan.awesomeapp.core.ui.PhotoListAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private androidx.recyclerview.widget.GridLayoutManager gridLayoutManager;
    @org.jetbrains.annotations.NotNull()
    public static final com.irfan.awesomeapp.core.ui.PhotoListAdapter.Companion Companion = null;
    public static final int SPAN_COUNT_ONE = 1;
    public static final int SPAN_COUNT_TWO = 2;
    public static final int VIEW_TYPE_GRID = 1;
    public static final int VIEW_TYPE_LIST = 2;
    private java.util.ArrayList<com.irfan.awesomeapp.core.domain.model.Photo> listPhoto;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.irfan.awesomeapp.core.domain.model.Photo, kotlin.Unit> onItemClick;
    
    public PhotoListAdapter(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.GridLayoutManager layoutManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.GridLayoutManager getGridLayoutManager() {
        return null;
    }
    
    public final void setGridLayoutManager(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.GridLayoutManager p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.irfan.awesomeapp.core.domain.model.Photo, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.irfan.awesomeapp.core.domain.model.Photo, kotlin.Unit> p0) {
    }
    
    @android.annotation.SuppressLint(value = {"NotifyDataSetChanged"})
    public final void setData(@org.jetbrains.annotations.Nullable()
    java.util.List<com.irfan.awesomeapp.core.domain.model.Photo> newListPhoto) {
    }
    
    @java.lang.Override()
    public int getItemViewType(int position) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.irfan.awesomeapp.core.ui.PhotoListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.irfan.awesomeapp.core.ui.PhotoListAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void setHasStableIds(boolean hasStableIds) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/irfan/awesomeapp/core/ui/PhotoListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "viewType", "", "(Lcom/irfan/awesomeapp/core/ui/PhotoListAdapter;Landroid/view/View;I)V", "bind", "", "photo", "Lcom/irfan/awesomeapp/core/domain/model/Photo;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private int viewType;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, int viewType) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.irfan.awesomeapp.core.domain.model.Photo photo) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/irfan/awesomeapp/core/ui/PhotoListAdapter$Companion;", "", "()V", "SPAN_COUNT_ONE", "", "SPAN_COUNT_TWO", "VIEW_TYPE_GRID", "VIEW_TYPE_LIST", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}